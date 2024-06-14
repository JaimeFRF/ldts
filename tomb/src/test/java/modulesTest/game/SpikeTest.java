package modulesTest.game;

import modules.game.Position;
import modules.game.Spike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

public class SpikeTest {

    private Spike spike;
    private List<Spike> spikeList;

    @BeforeEach
    void helper(){
        Position position = mock(Position.class);
        spike = new Spike(position.getX(), position.getY());
    }

    @Test
    void wallConstructor(){
        assertNotNull(spike);
    }



}
