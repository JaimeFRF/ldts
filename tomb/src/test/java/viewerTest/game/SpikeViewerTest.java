package viewerTest.game;

import viewer.game.SpikeViewer;
import gui.Gui;
import modules.game.Spike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class SpikeViewerTest {

    private Spike spike;
    private SpikeViewer spikeViewer;
    private Gui gui;

    @BeforeEach
    public void helper(){
        spike = new Spike(7,8);
        spikeViewer = new SpikeViewer();
        gui = Mockito.mock(Gui.class);
    }

    @Test
    public void drawTest(){
        spikeViewer.draw(spike, gui);
        Mockito.verify(gui, Mockito.times(1)).drawSpike(spike.getPosition());
    }

}
