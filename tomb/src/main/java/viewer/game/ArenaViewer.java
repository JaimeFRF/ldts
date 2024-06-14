package viewer.game;

import viewer.Viewer;
import gui.Gui;
import modules.Element;
import modules.game.arena.Arena;

import java.util.List;


public class ArenaViewer extends Viewer<Arena> {


    public ArenaViewer(Arena arena){
        super(arena);
    }

    @Override
    public void drawElements(Gui gui) {
        drawElements(gui, getModel().getWalls(), new WallViewer());
        drawElement(gui, getModel().getHero(), new HeroViewer());
        drawElements(gui, getModel().getCoins(), new CoinViewer());
        drawElements(gui, getModel().getMonsters(), new MonsterViewer());
        drawElements(gui, getModel().getSpikes(), new SpikeViewer());
    }

    private<T extends Element> void drawElements(Gui gui, List<T> elements, ElementViewer<T> viewer){
        for(T element : elements)
            drawElement(gui, element, viewer);
    }

    private<T extends Element> void drawElement(Gui gui, T element, ElementViewer<T> viewer){
        viewer.draw(element, gui);
    }

}
