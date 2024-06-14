package modulesTest.game;

import modules.game.Hero;
import modules.game.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PositionTest {
    private Position currentPosition;

    @BeforeEach
    void helper()
    {
        currentPosition = new Position(9,8);
    }

    @Test
    public void getXTest(){
        assertEquals(9, currentPosition.getX());
    }

    @Test
    public void getYTest(){
        assertEquals(8, currentPosition.getY());
    }


    @Test
    public void changePosTest(){
        Hero hero = new Hero(2,3);
        hero.setPosition(new Position(1, 4));
        Position pos = new Position(1,4);
        assertTrue(pos.equals(hero.getPosition()));
    }

    @Test
    public void upTest(){
        Position newPosition = new Position(9, 9);
        newPosition = newPosition.up();
        assertTrue(newPosition.equals(currentPosition));
    }

    @Test
    public void downTest(){
        Position newPosition = new Position(9, 7);
        newPosition = newPosition.down();
        assertTrue(newPosition.equals(currentPosition));
    }

    @Test
    public void leftTest(){
        Position newPosition = new Position(10,8);
        newPosition = newPosition.left();
        assertTrue(newPosition.equals(currentPosition));
    }

    @Test
    public void rightTest(){
        Position newPosition = new Position(8,8);
        newPosition = newPosition.right();
        assertTrue(newPosition.equals(currentPosition));
    }


}
