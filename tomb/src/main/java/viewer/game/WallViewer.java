package viewer.game;

import gui.Gui;
import modules.game.Wall;

public class WallViewer implements ElementViewer<Wall>{
    @Override
    public void draw(Wall wall, Gui gui) {
        gui.drawWall(wall.getPosition());
    }
}
