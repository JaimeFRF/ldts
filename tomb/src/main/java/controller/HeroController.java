package controller;

import viewer.Viewer;
import com.tomb.git.Game;
import controller.game.commands.Command;
import controller.game.commands.commands.MoveHeroDownCommand;
import controller.game.commands.commands.MoveHeroLeftCommand;
import controller.game.commands.commands.MoveHeroRightCommand;
import controller.game.commands.commands.MoveHeroUpCommand;
import gui.Gui;
import modules.game.arena.Arena;

import java.io.IOException;

public class HeroController extends Controller<Arena> {

    public HeroController(Arena arena){super(arena);}
    @Override
    public void step(Game game, Gui.ACTION action, Viewer viewer, Gui gui) throws IOException {
        if(action != Gui.ACTION.NONE){
            if(action == Gui.ACTION.RIGHT){
                Command command = new MoveHeroRightCommand(getModel());
                command.execute(viewer, gui);
            }
            else if(action == Gui.ACTION.LEFT) {
                Command command = new MoveHeroLeftCommand(getModel());
                command.execute(viewer, gui);
            }
            else if(action == Gui.ACTION.UP){
                Command command = new MoveHeroUpCommand(getModel());
                command.execute(viewer, gui);
            }
            else if(action == Gui.ACTION.DOWN){
                Command command = new MoveHeroDownCommand(getModel());
                command.execute(viewer, gui);
            }
        }
    }
}
