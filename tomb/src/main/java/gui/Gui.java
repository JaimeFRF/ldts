package gui;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import modules.game.Position;

import java.io.IOException;

public interface Gui {
    ACTION getNextAction() throws IOException;

    void refresh() throws IOException;

    void close() throws IOException;

    void clear();

    Screen getScreen();

    TerminalSize getTerminalSize();

    void drawText(TextGraphics graphics, Position position, String text, String color);

    void drawCharacter(Position position, char c, String color);

    void drawHero(Position position);
    void drawWall(Position position);

    void drawCoin(Position position);

    void drawMonster(Position position);

    void drawSpike(Position position);

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT};

}
