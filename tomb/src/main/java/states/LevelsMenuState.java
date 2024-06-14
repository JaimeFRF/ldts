package states;

import viewer.Viewer;
import controller.Controller;
import controller.menu.LevelsMenuController;
import modules.menu.LevelsMenu;
import viewer.menu.LevelsMenuViewer;

public class LevelsMenuState extends State<LevelsMenu> {
    public LevelsMenuState(LevelsMenu model) {
        super(model);
    }

    @Override
    protected Viewer<LevelsMenu> getViewer() {
        return new LevelsMenuViewer(getModel());
    }

    @Override
    protected Controller<LevelsMenu> getController() {
        return new LevelsMenuController(getModel());
    }
}
