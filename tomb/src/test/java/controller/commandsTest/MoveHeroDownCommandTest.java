package controller.commandsTest;


import viewer.Viewer;
import controller.game.commands.commands.MoveHeroDownCommand;
import gui.Gui;
import modules.game.arena.Arena;
import modules.game.Position;
import modules.game.arena.LoaderArenaBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;


public class MoveHeroDownCommandTest {

    MoveHeroDownCommand moveHeroDownCommand;
    Arena arena;
    @BeforeEach
    public void helper() throws IOException, FontFormatException {
        arena = new LoaderArenaBuilder(1).createArena(1);
        moveHeroDownCommand = new MoveHeroDownCommand(arena);
    }

    @Test
    public void constructorTest(){
        assertNotNull(moveHeroDownCommand);
    }

    @Test
    public void executeTest() throws IOException {
        Viewer viewer = mock(Viewer.class);
        Gui gui = mock(Gui.class);
        MoveHeroDownCommand command = new MoveHeroDownCommand(arena);
        command.execute(viewer,gui);
        Position pos = new Position(8,9);
        assertEquals(arena.getHero().getPosition(),pos);
    }
}
