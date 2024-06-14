package controller.game.commands;

import viewer.Viewer;
import gui.Gui;
import java.io.IOException;

public abstract class Command  {
    public abstract void execute(Viewer viewer, Gui gui) throws IOException;
}
