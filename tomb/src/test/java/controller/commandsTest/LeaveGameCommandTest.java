package controller.commandsTest;
import viewer.Viewer;
import controller.game.commands.commands.LeaveGameCommand;
import gui.Gui;
import modules.game.arena.Arena;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;


public class LeaveGameCommandTest {

    LeaveGameCommand moveHeroDownCommand;
    Arena arena;
    @BeforeEach
    public void helper() throws IOException, FontFormatException {
        arena = new Arena(2);
        moveHeroDownCommand = new LeaveGameCommand(arena);
    }

    @Test
    public void executeTest() {
        Viewer viewer = mock(Viewer.class);
        Gui gui = mock(Gui.class);
        LeaveGameCommand command = new LeaveGameCommand(arena);
        command.execute(viewer,gui);
        assertTrue(arena.getCoins().isEmpty());
    }
}
