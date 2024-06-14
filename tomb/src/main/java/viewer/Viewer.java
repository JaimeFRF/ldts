package viewer;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import gui.Gui;
import modules.game.Position;
import java.io.IOException;

public abstract class Viewer<T> {

    private final T model;

    public Viewer(T model){
        this.model = model;
    }

    public void draw(Gui gui) throws IOException {
        gui.clear();
        drawElements(gui);
        gui.refresh();
    }

    public abstract void drawElements(Gui gui) throws IOException;

    public T getModel(){return model;}

    protected void drawWalls(Gui gui, TextGraphics graphics){
        for(int i = 0; i < 52; i++){
            for(int j = 0; j <50; j++){
                if (i <= 1 || j <= 1 || j >= 48 || i >= 50)
                    gui.drawText(graphics, new Position(i,j), "" + '#', "#FFFFFF");
            }
        }
    }


    public TextGraphics getGraphics(Gui gui) {
        TextGraphics graphics = gui.getScreen().newTextGraphics();
        graphics.setBackgroundColor(TextColor.Factory.fromString("default"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(gui.getTerminalSize().getColumns(), gui.getTerminalSize().getRows()), ' ');
        graphics.setForegroundColor(TextColor.Factory.fromString("white"));
        return graphics;
    }
}
