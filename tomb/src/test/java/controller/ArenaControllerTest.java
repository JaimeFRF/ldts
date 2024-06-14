package controller;

import viewer.Viewer;
import com.tomb.git.Game;
import gui.Gui;
import modules.game.arena.Arena;
import modules.game.arena.LoaderArenaBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import states.GameOverMenuState;

import java.awt.*;
import java.io.IOException;

public class ArenaControllerTest {

    private ArenaController arenaController;

    private Viewer viewer;
    private Game game;
    private Gui gui;
    private Arena arena;

    @BeforeEach
    public void helper() throws IOException, FontFormatException {
        arena = new LoaderArenaBuilder(2).createArena(2);
        game = new Game();
        gui = Mockito.mock(Gui.class);
        arenaController = new ArenaController(arena);
        viewer = Mockito.mock(Viewer.class);
    }


    @Test
    public void step() throws IOException, FontFormatException {
        arenaController.step(game, Gui.ACTION.QUIT, viewer, gui );
        Assertions.assertInstanceOf(GameOverMenuState.class, game.getState());
    }

}
