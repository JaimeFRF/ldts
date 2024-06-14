package controller.game.commands.commands;

import viewer.Viewer;
import controller.game.commands.Command;
import gui.Gui;
import modules.game.Coin;
import modules.game.arena.Arena;

import java.util.List;


public class LeaveGameCommand extends Command {

    private final Arena arena;
    public LeaveGameCommand(Arena arena){
        this.arena = arena;
    }
    @Override
    public void execute(Viewer viewer, Gui gui)  {
        List<Coin> coins = arena.getCoins();
        coins.clear();
    }
}
