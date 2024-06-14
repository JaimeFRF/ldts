package controller;

import viewer.Viewer;
import com.tomb.git.Game;
import gui.Gui;
import modules.game.Hero;
import modules.game.Position;
import modules.game.arena.Arena;
import modules.game.arena.LoaderArenaBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class HeroControllerTest {

    private Hero hero;
    private Arena arena;
    private Game game;
    private Gui gui;
    private Position position;
    private Viewer viewer;
    private HeroController heroController;

    @BeforeEach
    public void helper() throws IOException {
        arena = new LoaderArenaBuilder(2).createArena(2);
        position = new Position(6,26);
        hero = new Hero(position.getX(), position.getY());
        game = Mockito.mock(Game.class);
        gui = Mockito.mock(Gui.class);
        heroController = new HeroController(arena);

    }

    @Test
    public void moveHeroRight() throws IOException {
        viewer = Mockito.mock(Viewer.class);
        heroController.step(game, Gui.ACTION.RIGHT, viewer, gui);

        Assertions.assertNotEquals(heroController.getModel().getHero().getPosition(), new Position(6,26));
    }

    @Test
    public void moveHeroLeft() throws IOException{
        viewer = Mockito.mock(Viewer.class);
        heroController.step(game, Gui.ACTION.LEFT, viewer, gui);

        Assertions.assertNotEquals(heroController.getModel().getHero().getPosition(), new Position(6,26));
    }

    @Test
    public void moveHeroUp() throws IOException{
        viewer = Mockito.mock(Viewer.class);
        heroController.step(game, Gui.ACTION.UP, viewer, gui);

        Assertions.assertNotEquals(heroController.getModel().getHero().getPosition(), new Position(6,26));
    }

    @Test
    public void moveHeroDown() throws IOException{
        viewer = Mockito.mock(Viewer.class);
        heroController.step(game, Gui.ACTION.DOWN, viewer, gui);

        Assertions.assertNotEquals(heroController.getModel().getHero().getPosition(), new Position(6,26));
    }

}
