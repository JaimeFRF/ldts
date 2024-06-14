package viewerTest.menu;

import viewer.menu.MenuViewer;
import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import gui.Lanterna;
import modules.menu.InitialMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class MenuViewerTest {

    private Lanterna gui;
    private MenuViewer menuViewer;
    private TextGraphics graphics;

    @BeforeEach
    public void helper() throws IOException {
        graphics = Mockito.mock(TextGraphics.class);
        Screen screen = Mockito.mock(Screen.class);
        menuViewer = new MenuViewer(new InitialMenu());
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
        Assertions.assertNotNull(menuViewer);
    }

    @Test
    public void drawElements(){
        menuViewer.drawElements(gui);
        Mockito.verify(graphics, Mockito.times(1)).putString(15,5, "TOMB OF THE MASK", SGR.BOLD);
    }



}
