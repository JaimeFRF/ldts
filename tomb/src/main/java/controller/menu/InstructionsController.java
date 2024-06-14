package controller.menu;

import viewer.Viewer;
import com.tomb.git.Game;
import controller.Controller;
import gui.Gui;
import modules.menu.InitialMenu;
import modules.menu.InstructionsMenu;
import states.MenuState;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class InstructionsController extends Controller<InstructionsMenu> {

    public InstructionsController(InstructionsMenu instructionsMenu){super(instructionsMenu);}

    @Override
    public void step(Game game, Gui.ACTION action, Viewer viewer, Gui gui) throws IOException, FontFormatException {
        if (Objects.requireNonNull(action) == Gui.ACTION.QUIT) {
            game.setState(new MenuState(new InitialMenu()));
        }
    }
}
