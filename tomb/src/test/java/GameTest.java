import com.tomb.git.Game;
import modules.game.arena.Arena;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import gui.Lanterna;

import java.awt.*;
import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameTest {

    Game game;

    @BeforeEach
    public void helper() throws IOException, FontFormatException {
        game = new Game();
    }

    @Test
    public void constructorTest(){
        assertNotNull(game);
    }


}
