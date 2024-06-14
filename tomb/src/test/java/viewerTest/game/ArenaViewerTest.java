package viewerTest.game;

import viewer.game.ArenaViewer;
import gui.Gui;
import modules.game.*;
import modules.game.arena.Arena;
import modules.game.arena.LoaderArenaBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;

public class ArenaViewerTest {

    Arena arena;
    ArenaViewer arenaViewer;

    Gui gui;
    @BeforeEach
    public void helper() throws IOException {
        arena = new LoaderArenaBuilder(2).createArena(2);
        gui = Mockito.mock(Gui.class);
        arenaViewer = new ArenaViewer(arena);
        arena.setHero(new Hero(1,2));
        arena.setWalls(Arrays.asList(new Wall(6,7), new Wall(6,8)));

    }

    @Test
    public void constructor(){
        Assertions.assertNotNull(arenaViewer);
    }

    @Test
    public void drawHero() throws IOException {
        arenaViewer.draw(gui);
        Mockito.verify(gui, Mockito.times(1)).drawHero(new Position(1,2));
    }

    @Test
    public void drawWalls() throws IOException{
        arenaViewer.draw(gui);
        Mockito.verify(gui, Mockito.times(1)).drawWall(new Position(6,7));
        Mockito.verify(gui, Mockito.times(1)).drawWall(new Position(6,8));
        Mockito.verify(gui, Mockito.times(2)).drawWall(Mockito.any(Position.class));
    }








}
