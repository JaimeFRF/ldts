package modulesTest.game;

import modules.game.Position;
import modules.game.Wall;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tomb.git.FileReader;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

public class WallTest {

    private Wall wall;
    private List<Wall> wallList;

    @BeforeEach
    void helper(){
        Position position = mock(Position.class);
        wall = new Wall(position.getX(), position.getY());
    }

    @Test
    void wallConstructor(){
        assertNotNull(wall);
    }



}
