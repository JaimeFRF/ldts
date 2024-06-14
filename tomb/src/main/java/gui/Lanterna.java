package gui;


import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.AWTTerminalFontConfiguration;
import modules.game.Position;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static com.googlecode.lanterna.screen.Screen.RefreshType.AUTOMATIC;

public class Lanterna implements Gui {
    private  Screen screen;
    private static TerminalSize terminalSize;


    public Lanterna(Screen screen){
        this.screen = screen;
    }
    public Lanterna(int x, int y) throws IOException, FontFormatException {
        terminalSize = new TerminalSize(x, y);
        Terminal terminal = createTerminal();
        screen = createScreen(terminal);
    }

    private Terminal createTerminal() throws IOException, FontFormatException {

        DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory();
        terminalFactory.setTerminalEmulatorFontConfiguration(loadFont());
        terminalFactory.setForceAWTOverSwing(true);
        terminalFactory.setInitialTerminalSize(terminalSize);

        Terminal terminal = terminalFactory.createTerminal();

        createScreen(terminal);
        return terminal;
    }

    private AWTTerminalFontConfiguration loadFont() throws IOException, FontFormatException{
        File fontFile = new File("./src/main/resources/textFiles/ldts1.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);
        Font loadedFont = font.deriveFont(Font.PLAIN, 15);
        return AWTTerminalFontConfiguration.newInstance(loadedFont);
    }

    private Screen createScreen(Terminal terminal) throws IOException {
        screen = new TerminalScreen(terminal);
        screen.setCursorPosition(null);
        screen.startScreen();
        screen.doResizeIfNecessary();
        return screen;
    }

    public  Screen getScreen() {
        return screen;
    }

    public ACTION getNextAction() throws IOException {
        KeyStroke readInput = screen.pollInput();

        if(readInput == null) {return ACTION.NONE;}

        else if(readInput.getKeyType() == KeyType.ArrowUp){return ACTION.UP;}
        else if(readInput.getKeyType() == KeyType.ArrowRight){return ACTION.RIGHT;}
        else if(readInput.getKeyType() == KeyType.ArrowLeft){return ACTION.LEFT;}
        else if(readInput.getKeyType() == KeyType.ArrowDown){return ACTION.DOWN;}
        else if(readInput.getKeyType() == KeyType.Enter){return ACTION.SELECT;}
        else if(readInput.getKeyType() == KeyType.Character){return ACTION.QUIT;}

        else{return ACTION.NONE;}
    }

    public void clear(){screen.clear();}
    public void refresh() throws IOException {
        screen.refresh(AUTOMATIC);
    }
    public void close() throws IOException {
        screen.close();
    }

    public TerminalSize getTerminalSize(){
        return terminalSize;
    }

    @Override
    public void drawText(TextGraphics graphics, Position position, String text, String color) {
        graphics.setForegroundColor(TextColor.Factory.fromString(color));
        graphics.putString(position.getX(), position.getY(), text);
    }

    public void drawCharacter(Position position, char c, String color){
        TextGraphics graphics = screen.newTextGraphics();
        graphics.setForegroundColor(TextColor.Factory.fromString(color));
        graphics.putString(position.getX(), position.getY(), Character.toString(c));
    }

    public void drawHero(Position position){
        drawCharacter(position, '@', "#FFD700");
    }

    public void drawWall(Position position){
        drawCharacter(position, '#', "#8B0000");
    }

    public void drawCoin(Position position){
        drawCharacter(position, '.', "#F0E68C");
    }

    public void drawSpike(Position position){
        drawCharacter(position, 'p', "#c0c0c0");
    }



    public void drawMonster(Position position){drawCharacter(position, 'b', "#00FFFF");}

}
