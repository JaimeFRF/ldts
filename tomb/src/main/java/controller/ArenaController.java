package controller;

import viewer.Viewer;
import com.tomb.git.Game;
import gui.Gui;
import modules.game.arena.Arena;
import modules.menu.GameOverMenu;
import states.GameOverMenuState;

import java.awt.*;
import java.io.IOException;


public class ArenaController extends Controller<Arena> {

    private final HeroController heroController;
    private final MonsterController monsterController;

    public ArenaController(Arena arena){
        super(arena);
        this.heroController = new HeroController(arena);
        this.monsterController = new MonsterController(arena);
    }

    @Override
    public void step(Game game, Gui.ACTION action, Viewer viewer, Gui gui) throws IOException, FontFormatException {
        if(!getModel().isFinished() && action != Gui.ACTION.QUIT){
            heroController.step(game, action, viewer, gui);
            monsterController.step(game, action, viewer, gui);
        }
        else {
            int level = getModel().getLevel();
            game.setState(new GameOverMenuState(new GameOverMenu(level)));
        }
    }


}
