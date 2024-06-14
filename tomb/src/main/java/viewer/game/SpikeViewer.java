package viewer.game;

import gui.Gui;
import modules.game.Spike;

public class SpikeViewer implements ElementViewer<Spike>{
    @Override
    public void draw(Spike spike, Gui gui) {gui.drawSpike(spike.getPosition());}
}