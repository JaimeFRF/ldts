package controller.menu;

import viewer.Viewer;
import com.tomb.git.Game;
import controller.Controller;
import gui.Gui;
import modules.menu.InitialMenu;
import modules.menu.InstructionsMenu;
import modules.menu.LevelsMenu;
import states.InstructionsState;
import states.LevelsMenuState;


public class MenuController extends Controller<InitialMenu> {

    public MenuController(InitialMenu model){
        super(model);
    }

    @Override
    public void step(Game game, Gui.ACTION action, Viewer viewer, Gui gui) {
        switch (action) {
            case DOWN -> getModel().nextEntry();
            case UP -> getModel().previousEntry();
            case SELECT ->
                step(game);
        }
    }

    private void step(Game game) {
        boolean thirdEntry = getModel().thirdEntry();
        boolean secondEntry = getModel().secondEntry();

        if (thirdEntry) {
            game.setState(null);
        } else if (secondEntry) {
            game.setState(new InstructionsState(new InstructionsMenu()));
        } else {
            game.setState(new LevelsMenuState(new LevelsMenu()));
        }
    }
}
