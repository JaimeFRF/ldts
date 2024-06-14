package controller;

import viewer.Viewer;
import com.tomb.git.Game;
import gui.Gui;
import modules.game.Monster;
import modules.game.Position;
import modules.game.arena.Arena;
import modules.game.arena.LoaderArenaBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;

public class MonsterControllerTest {

    private Monster monster;
    private Arena arena;
    private Gui gui;
    private Game game;
    private MonsterController monsterController;
    private Viewer viewer;


    @BeforeEach
    public void helper() throws IOException {
        arena = new LoaderArenaBuilder(2).createArena(2);
        game = Mockito.mock(Game.class);
        monster = new Monster(7,33);
        arena.setMonsters(Arrays.asList(monster));
        monsterController = new MonsterController(arena);
        gui = Mockito.mock(Gui.class);

    }

    @Test
    public void moveMonster(){
        viewer = Mockito.mock(Viewer.class);
        monsterController.step(game, Gui.ACTION.UP, viewer, gui);

        Assertions.assertNotEquals(monster.getPosition(), new Position(7,33));
    }



}
