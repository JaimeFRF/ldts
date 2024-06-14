package viewerTest.game;

import viewer.game.HeroViewer;
import gui.Gui;
import modules.game.Hero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HeroViewerTest {
    private Hero hero;
    private HeroViewer heroViewer;
    private Gui gui;
    @BeforeEach
    public void helper(){
        hero = new Hero(7,8);
        heroViewer = new HeroViewer();
        gui = Mockito.mock(Gui.class);

    }

    @Test
    public void drawTest(){
        heroViewer.draw(hero, gui);
        Mockito.verify(gui, Mockito.times(1)).drawHero(hero.getPosition());
    }

}
