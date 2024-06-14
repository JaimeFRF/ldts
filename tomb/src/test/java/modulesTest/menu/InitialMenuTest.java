package modulesTest.menu;
import modules.menu.InitialMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;



public class InitialMenuTest {
    private InitialMenu initialMenu;
    @BeforeEach
    public void helper(){
        initialMenu = new InitialMenu();
    }

    @Test
    public void constructorTest(){
        Assertions.assertNotNull(initialMenu);
    }

    @Test
    public void nextEntryTest(){
        initialMenu.nextEntry();
        Assertions.assertEquals(1, initialMenu.getCurrentEntry());
        initialMenu.nextEntry();
        initialMenu.nextEntry();
        Assertions.assertEquals(0, initialMenu.getCurrentEntry());
    }

    @Test
    public void previousEntryTest(){
        initialMenu.previousEntry();
        Assertions.assertEquals(2, initialMenu.getCurrentEntry());
        initialMenu.previousEntry();
        Assertions.assertEquals(1, initialMenu.getCurrentEntry());
    }

    @Test
    public void currentEntryTest(){
        Assertions.assertTrue(initialMenu.isSelected(0));
    }

    @Test
    public void secondEntryTest(){
        initialMenu.nextEntry();
        Assertions.assertTrue(initialMenu.secondEntry());
    }

    @Test
    public void thirdEntryTest(){
        initialMenu.nextEntry();
        initialMenu.nextEntry();
        Assertions.assertTrue(initialMenu.thirdEntry());
    }


    @Test
    public void getEntriesTest(){
        List<String> expectedList = Arrays.asList("START", "INSTRUCTIONS", "EXIT");
        Assertions.assertEquals(expectedList, initialMenu.getEntries());
    }
}
