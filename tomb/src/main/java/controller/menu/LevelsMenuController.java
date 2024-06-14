package controller.menu;

import viewer.Viewer;
import com.tomb.git.Game;
import controller.Controller;
import gui.Gui;
import modules.game.arena.Arena;
import modules.game.arena.LoaderArenaBuilder;
import modules.menu.LevelsMenu;
import states.ArenaState;

import java.awt.*;
import java.io.IOException;

public class LevelsMenuController extends Controller<LevelsMenu> {

    public LevelsMenuController(LevelsMenu model) {
        super(model);
    }

    @Override
    public void step(Game game, Gui.ACTION action, Viewer viewer, Gui gui) throws IOException, FontFormatException {
        switch (action) {
            case DOWN -> getModel().nextEntry();
            case UP -> getModel().previousEntry();
            case SELECT -> {
                if (getModel().secondEntry()) {
                    Arena arena = new LoaderArenaBuilder(2).createArena(2);
                    game.setState(new ArenaState(arena));
                } else if (getModel().thirdEntry()) {
                    Arena arena = new LoaderArenaBuilder(3).createArena(3);
                    game.setState(new ArenaState(arena));
                } else {
                    game.setState(new ArenaState(new LoaderArenaBuilder(1).createArena(1)));
                }

            }
        }
    }
}
