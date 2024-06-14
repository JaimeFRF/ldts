package modulesTest.menu;

import modules.menu.GameOverMenu;
import net.bytebuddy.description.type.TypeList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameOverMenuTest {
    private GameOverMenu gameOverMenu;
    @BeforeEach
    public void helper(){
        gameOverMenu = new GameOverMenu(1);
    }

    @Test
    public void constructorTest(){
        Assertions.assertNotNull(gameOverMenu);
    }

    @Test
    public void getCurrentLevelTest(){
        Assertions.assertEquals(1, gameOverMenu.getCurrentLevel());
    }

}
