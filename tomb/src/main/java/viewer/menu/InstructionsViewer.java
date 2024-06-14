package viewer.menu;

import viewer.Viewer;
import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.graphics.TextGraphics;
import gui.Gui;
import modules.game.Position;
import modules.menu.InstructionsMenu;

public class InstructionsViewer extends Viewer<InstructionsMenu> {

    public InstructionsViewer(InstructionsMenu instructionsMenu){super(instructionsMenu);}

    @Override
    public void drawElements(Gui gui){
        TextGraphics graphics = getGraphics(gui);
        gui.drawText(graphics, new Position(5,5),"IN THIS AMAZING GAME YOU CAN BECOME", "#FFFFFF" );
        gui.drawText(graphics, new Position(5,8), "AN EXPLORER, BY COLLECTING ALL THE COINS", "#FFFFFF");
        gui.drawText(graphics, new Position(5,11), "THROUGH DIFFERENT MAZES AND CHALLENGES!", "#FFFFFF");
        gui.drawText(graphics, new Position(5, 14), "YOU WILL HAVE TO FACE... ", "#FFFFFF");
        gui.drawText(graphics, new Position(5,17), "ENIGMAS...","#FFFFFF");
        gui.drawText(graphics, new Position(5,20), "SPIKES YOU CAN NOT TOUCH...", "#FFFFFF");
        gui.drawText(graphics, new Position(5,23), "AND, OF COURSE, MONSTERS...", "#FFFFFF");
        gui.drawText(graphics, new Position(18, 28), "SO... BE AWARE!", "#FFFFFF");

        graphics.putString(14, 36, "PRESS ANY LETTER TO LEAVE", SGR.BLINK);
        drawWalls(gui, graphics);
    }
}
