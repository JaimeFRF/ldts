package viewer.game;

import gui.Gui;
import modules.game.Monster;

public class MonsterViewer implements ElementViewer<Monster> {


    @Override
    public void draw(Monster monster, Gui gui) {
        gui.drawMonster(monster.getPosition());
    }
}
