package viewer.menu;

import viewer.Viewer;
import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.graphics.TextGraphics;
import gui.Gui;
import modules.game.Position;
import modules.menu.InitialMenu;


public class MenuViewer extends Viewer<InitialMenu> {

    public MenuViewer(InitialMenu model){
        super(model);
    }


    @Override
    public void drawElements(Gui gui) {
        TextGraphics graphics = getGraphics(gui);
        graphics.putString(15, 5, "TOMB OF THE MASK", SGR.BOLD);
        for(int i = 0; i < getModel().getEntries().size(); i++){
                gui.drawText(graphics, new Position(15, 25 + i), getModel().getEntries().get(i), getModel().isSelected(i) ? "#FFFFFF" : "#FFD700");
        }
        drawWalls(gui, graphics);
    }


}
