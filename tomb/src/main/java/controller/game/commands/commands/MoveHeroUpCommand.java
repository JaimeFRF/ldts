package controller.game.commands.commands;

import viewer.Viewer;
import controller.game.commands.Command;
import gui.Gui;
import modules.game.arena.Arena;
import modules.game.Position;

import java.io.IOException;

public class MoveHeroUpCommand extends Command {

    private final Arena arena;

    public MoveHeroUpCommand(Arena arena){
        this.arena = arena;
    }

    @Override
    public void execute(Viewer viewer, Gui gui) throws IOException {
        Position position = arena.getHero().getPosition().up();
        while(arena.isEmptyTile(position)) {
            if(arena.isMonster()){
                arena.setArenaFinished(true);
                break;
            }
            else{
                arena.moveHero(position);
                position = arena.getHero().getPosition().up();
                viewer.draw(gui);
            }

        }
    }

}
