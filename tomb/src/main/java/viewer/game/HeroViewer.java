package viewer.game;

import gui.Gui;
import modules.game.Hero;

public class HeroViewer implements ElementViewer<Hero>{


    @Override
    public void draw(Hero hero, Gui gui) {
        gui.drawHero(hero.getPosition());
    }
}
