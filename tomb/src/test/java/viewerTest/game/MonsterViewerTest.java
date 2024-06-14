package viewerTest.game;

import viewer.game.MonsterViewer;
import gui.Gui;
import modules.game.Monster;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MonsterViewerTest {
    private Monster monster;
    private Gui gui;
    private MonsterViewer monsterViewer;

    @BeforeEach
    public void helper(){
        monster = new Monster(7,8);
        monsterViewer = new MonsterViewer();
        gui = Mockito.mock(Gui.class);
    }

    @Test
    public void drawTest(){
        monsterViewer.draw(monster, gui);
        Mockito.verify(gui, Mockito.times(1)).drawMonster(monster.getPosition());
    }
}
