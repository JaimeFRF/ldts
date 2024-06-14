package viewer.menu;

import viewer.Viewer;
import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.graphics.TextGraphics;
import gui.Gui;
import modules.game.Position;
import modules.menu.GameOverMenu;
public class GameOverMenuViewer extends Viewer<GameOverMenu> {

    public GameOverMenuViewer(GameOverMenu menu){super(menu);}
    @Override
    public void drawElements(Gui gui) {
        TextGraphics graphics = getGraphics(gui);
        graphics.putString(15, 5, "GAME OVER", SGR.BOLD);

        drawElements(gui, graphics);
        drawWalls(gui, graphics);
    }

    private void drawElements(Gui gui, TextGraphics graphics) {
        for(int i = 0; i < getModel().getEntries().size(); i++){
            boolean selected = getModel().isSelected(i);
            gui.drawText(graphics, new Position(15, 25 + i), getModel().getEntries().get(i), selected ? "#FFFFFF" : "#FFD700");
        }
    }
}
