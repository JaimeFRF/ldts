package viewerTest.menu;

import viewer.menu.LevelsMenuViewer;
import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import gui.Lanterna;
import modules.menu.LevelsMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class LevelsMenuViewerTest {

    private Lanterna gui;
    private TextGraphics graphics;
    private LevelsMenuViewer levelsMenuViewer;


    @BeforeEach
    public void helper(){
        graphics = Mockito.mock(TextGraphics.class);
        Screen screen = Mockito.mock(Screen.class);
        levelsMenuViewer = new LevelsMenuViewer(new LevelsMenu());
        gui = Mockito.mock(Lanterna.class);
        TerminalSize terminalSize = Mockito.mock(TerminalSize.class);
        Mockito.when(gui.getTerminalSize()).thenReturn(terminalSize);
        Mockito.when(gui.getTerminalSize().getRows()).thenReturn(50);
        Mockito.when(gui.getTerminalSize().getColumns()).thenReturn(52);
        Mockito.when(gui.getScreen()).thenReturn(screen);
        Mockito.when(screen.newTextGraphics()).thenReturn(graphics);
    }

    @Test
    public void constructor(){
        Assertions.assertNotNull(levelsMenuViewer);
    }

    @Test
    public void drawElements(){
        levelsMenuViewer.drawElements(gui);
        Mockito.verify(graphics, Mockito.times(1)).putString(15, 5, "CHOOSE THE DIFFICULTY", SGR.BOLD);
    }

}
