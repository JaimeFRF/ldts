package controller.commandsTest;

import viewer.Viewer;
import controller.game.commands.commands.MoveHeroLeftCommand;
import gui.Gui;
import modules.game.arena.Arena;
import modules.game.Position;
import modules.game.arena.LoaderArenaBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MoveHeroLeftCommandTest {

    MoveHeroLeftCommand moveHeroLeftCommand;
    Arena arena;
    @BeforeEach
    public void helper() throws IOException, FontFormatException {
        arena = new LoaderArenaBuilder(1).createArena(1);
        moveHeroLeftCommand = new MoveHeroLeftCommand(arena);
    }

    @Test
    public void constructorTest(){
        assertNotNull(moveHeroLeftCommand);
    }

    @Test
    public void executeTest() throws IOException {
        Viewer viewer = mock(Viewer.class);
        Gui gui = mock(Gui.class);
        MoveHeroLeftCommand command = new MoveHeroLeftCommand(arena);
        command.execute(viewer,gui);
        Position pos = new Position(5,9);
        assertEquals(arena.getHero().getPosition(),pos);
    }
}
