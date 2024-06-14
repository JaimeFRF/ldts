package viewerTest.game;

import viewer.game.WallViewer;
import gui.Gui;
import modules.game.Wall;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WallViewerTest {

    private Wall wall;
    private WallViewer wallViewer;
    private Gui gui;

    @BeforeEach
    public void helper(){
        wall = new Wall(7,8);
        wallViewer = new WallViewer();
        gui = Mockito.mock(Gui.class);
    }

    @Test
    public void drawTest(){
        wallViewer.draw(wall, gui);
        Mockito.verify(gui, Mockito.times(1)).drawWall(wall.getPosition());
    }

}
