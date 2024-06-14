package states;

import viewer.Viewer;
import viewer.menu.GameOverMenuViewer;
import controller.Controller;
import controller.menu.GameOverMenuController;
import modules.menu.GameOverMenu;

public class GameOverMenuState extends State<GameOverMenu>{


    public GameOverMenuState(GameOverMenu menu){super(menu);}

    @Override
    protected Viewer<GameOverMenu> getViewer() {
        return new GameOverMenuViewer(getModel());
    }

    @Override
    protected Controller<GameOverMenu> getController() {
        return new GameOverMenuController(getModel());
    }
}
