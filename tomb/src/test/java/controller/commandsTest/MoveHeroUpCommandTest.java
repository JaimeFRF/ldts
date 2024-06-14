package controller.commandsTest;
import viewer.Viewer;
import controller.game.commands.commands.MoveHeroUpCommand;
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

public class MoveHeroUpCommandTest {

    private MoveHeroUpCommand moveHeroUpCommand;
    Arena arena;
    @BeforeEach
    public void helper() throws IOException, FontFormatException {
        arena = new LoaderArenaBuilder(2).createArena(2);
        moveHeroUpCommand = new MoveHeroUpCommand(arena);
    }

    @Test
    public void constructorTest(){
        assertNotNull(moveHeroUpCommand);
    }

    @Test
    public void executeTest() throws IOException {
        Viewer viewer = mock(Viewer.class);
        Gui gui = mock(Gui.class);
        MoveHeroUpCommand command = new MoveHeroUpCommand(arena);
        command.execute(viewer,gui);
        Position pos = new Position(8,9);
        assertEquals(arena.getHero().getPosition(),pos);
    }
}
