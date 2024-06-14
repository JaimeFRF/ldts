package modulesTest.menu;
import modules.menu.InitialMenu;
import modules.menu.LevelsMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class LevelsMenuTest {
    private LevelsMenu levelsMenu;
    @BeforeEach
    public void helper(){
        levelsMenu = new LevelsMenu();
    }

    @Test
    public void constructorTest(){
        Assertions.assertNotNull(levelsMenu);
    }

}
