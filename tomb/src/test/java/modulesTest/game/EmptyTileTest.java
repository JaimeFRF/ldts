package modulesTest.game;

import modules.game.EmptyTile;
import modules.game.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tomb.git.FileReader;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class EmptyTileTest {
    private EmptyTile emptyTile;
    private List<EmptyTile> emptyTileList;

    private List<EmptyTile> expectedEmptyTileList;


    @BeforeEach
    public void helper(){
        Position position = mock(Position.class);
        emptyTile = new EmptyTile(position.getX(), position.getY());
    }

    @Test
    public void emptyTileConstructor(){
        assertNotNull(emptyTile);
    }




}
