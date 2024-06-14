import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import gui.Gui;
import gui.Lanterna;
import modules.game.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.w3c.dom.Text;

import java.awt.*;
import java.io.IOException;

public class LanternaTest {

    private TextGraphics graphics;
    private Gui gui;

    private Screen screen;

    Position position = new Position(1,2);
    @BeforeEach
    public void helper() throws IOException, FontFormatException {
        graphics = Mockito.mock(TextGraphics.class);
        screen = Mockito.mock(Screen.class);

        Mockito.when(screen.newTextGraphics()).thenReturn(graphics);

        gui = new Lanterna(screen); //porque ter de fazer isto ?
    }

    @Test
    public void drawHero(){
        gui.drawHero(position);
        Mockito.verify(graphics, Mockito.times(1)).setForegroundColor(new TextColor.RGB(255, 215, 0));
        Mockito.verify(graphics, Mockito.times(1)).putString(position.getX(), position.getY(), "" + '@');

    }

    @Test
    public void drawMonster(){
        gui.drawMonster(position);
        Mockito.verify(graphics, Mockito.times(1)).setForegroundColor(TextColor.Factory.fromString("#00FFFF"));
    }

    @Test
    public void drawWall(){
        gui.drawWall(position);
        Mockito.verify(graphics, Mockito.times(1)).setForegroundColor(TextColor.Factory.fromString("#8B0000"));
    }

    @Test
    public void drawCoin() {
        gui.drawCoin(position);
        Mockito.verify(graphics, Mockito.times(1)).setForegroundColor(TextColor.Factory.fromString("#F0E68C"));
    }

    @Test
    public void drawText(){
        gui.drawText(graphics, position,"LDTS is cool", "#8B0000");
        Mockito.verify(graphics, Mockito.times(1)).setForegroundColor(TextColor.Factory.fromString("#8B0000"));
        Mockito.verify(graphics, Mockito.times(1)).putString(position.getX(), position.getY(), "LDTS is cool");
    }

    @Test
    public void closeTest() throws IOException {
        gui.close();
        Mockito.verify(screen, Mockito.times(1)).close();
    }

    @Test
    public void refreshTest() throws IOException{
        gui.refresh();
        Mockito.verify(screen, Mockito.times(1)).refresh(Screen.RefreshType.AUTOMATIC);
    }

    @Test
    public void clearTest(){
        gui.clear();
        Mockito.verify(screen, Mockito.times(1)).clear();
    }
}
