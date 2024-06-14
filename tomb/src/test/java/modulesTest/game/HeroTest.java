package modulesTest.game;

import com.googlecode.lanterna.graphics.TextGraphics;
import modules.game.Hero;
import modules.game.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class HeroTest {
    private Hero hero;

    @BeforeEach
    void helper(){
        Position position = mock(Position.class);
        hero = new Hero(position.getX(), position.getY());
    }

    @Test
    void constructorTest(){
        assertNotNull(hero);
    }





}
