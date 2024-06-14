package controller.commandsTest;

import viewer.Viewer;
import controller.game.commands.commands.MoveHeroRightCommand;
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


public class MoveHeroRightCommandTest {

    MoveHeroRightCommand moveHeroRightCommand;
    Arena arena;
    @BeforeEach
    public void helper() throws IOException, FontFormatException {
        arena = new LoaderArenaBuilder(2).createArena(2);
        moveHeroRightCommand = new MoveHeroRightCommand(arena);
    }


    @Test
    public void constructorTest(){
        assertNotNull(moveHeroRightCommand);
    }

    @Test
    public void executeTest() throws IOException {
        Viewer viewer = mock(Viewer.class);
        Gui gui = mock(Gui.class);
        MoveHeroRightCommand command = new MoveHeroRightCommand(arena);
        command.execute(viewer,gui);
        Position pos = new Position(48,9);
        assertEquals(arena.getHero().getPosition(),pos);
    }

}
