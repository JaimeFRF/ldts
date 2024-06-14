package modulesTest.game;

import modules.game.Coin;
import modules.game.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tomb.git.FileReader;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;


public class CoinTest {
    private Coin coin;

    @BeforeEach
    public void helper() throws IOException {
        Position position = mock(Position.class);
        coin = new Coin(position.getX(), position.getY());

    }

    @Test
    public void constructorTest(){
        Assertions.assertNotNull(coin);
    }


}
