package modulesTest.game;

import modules.game.*;
import modules.game.arena.Arena;
import modules.game.arena.LoaderArenaBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import java.awt.*;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


public class ArenaTest {
    Arena arena;

    @BeforeEach
    public void helper() throws IOException, FontFormatException {
        arena = new LoaderArenaBuilder(2).createArena(2);
    }

    @Test
    public void isArenaTest(){
        List<Coin> coins = Arrays.asList();
        arena.setCoins(coins);
        Assertions.assertTrue(arena.isFinished());
        coins = Arrays.asList(new Coin(1,2));
        arena.setCoins(coins);
        Assertions.assertFalse(arena.isFinished());
    }
    @Test
    public void constructorTest() throws IOException, FontFormatException {
        for(int i=1; i<=2;i++){
            Arena x = new LoaderArenaBuilder(i).createArena(i);
            assertNotNull(x);
        }
    }

    @Test
    public void isFinishedTest(){
        assertFalse(arena.getArenaFinished());
    }

    @Test
    public void moveHeroTest(){
        Position pos = new Position(8,8);
        Position inicial = arena.getHero().getPosition();
        arena.moveHero(pos);
        assertNotEquals(arena.getHero().getPosition(),inicial);
    }

    @Test
    public void isEmptyTileTestTrue(){
        Position pos = new Position(7,9);
        assertTrue(arena.isEmptyTile(pos));
    }
    @Test
    public void isEmptyTileTestFalse(){
        Position pos = new Position(9,7);
        assertFalse(arena.isEmptyTile(pos));
    }

    @Test
    public void retrieveCoinsTest(){
        Position pos = new Position(3,2);
        arena.retrieveCoins(pos);
        List<Coin> x = arena.getCoins();
        assertNotEquals(x.get(0).getPosition(),pos);
    }

    @Test
    public void getWallsTest(){
        List<Wall> wall = arena.getWalls();
        assertNotNull(wall);
    }
    @Test
    public void getMonsterTest(){
        List<Monster> monster = arena.getMonsters();
        assertNotNull(monster);
    }

    @Test
    public void getLevelTest(){
        assertEquals(arena.getLevel(),2);
    }
}
