package modules.menu;

import java.util.Arrays;

public class GameOverMenu extends Menu{

    private int currentLevel;
    public GameOverMenu(int currentLevel){
        this.entries = Arrays.asList("TRY AGAIN", "TRY ANOTHER DIFFICULTY", "MAIN MENU");
        this.currentLevel = currentLevel;
    }

    public int getCurrentLevel(){return currentLevel;}

}
