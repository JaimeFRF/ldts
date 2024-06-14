package controller.menu;

import viewer.Viewer;
import com.tomb.git.Game;
import controller.Controller;
import gui.Gui;
import modules.game.arena.LoaderArenaBuilder;
import modules.menu.GameOverMenu;
import modules.menu.InitialMenu;
import modules.menu.LevelsMenu;
import states.ArenaState;
import states.LevelsMenuState;
import states.MenuState;

import java.io.IOException;

public class GameOverMenuController extends Controller<GameOverMenu> {

    public GameOverMenuController(GameOverMenu menu){super(menu);}

    @Override
    public void step(Game game, Gui.ACTION action, Viewer viewer, Gui gui) throws IOException {
        switch (action){
            case DOWN:
                getModel().nextEntry();
                break;
            case UP:
                getModel().previousEntry();
            case SELECT:
                if(getModel().secondEntry()){
                    game.setState(new LevelsMenuState(new LevelsMenu()));
                }
                else if(getModel().thirdEntry())
                    game.setState(new MenuState(new InitialMenu()));
                else{
                    game.setState(new ArenaState(new LoaderArenaBuilder(getModel().getCurrentLevel()).createArena(getModel().getCurrentLevel())));
                }
        }
    }


}
