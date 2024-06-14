package states;

import viewer.Viewer;
import controller.Controller;
import controller.menu.MenuController;
import modules.menu.InitialMenu;
import viewer.menu.MenuViewer;

public class MenuState extends State<InitialMenu>{

    public MenuState(InitialMenu model){
        super(model);
    }

    @Override
    protected Viewer<InitialMenu> getViewer(){
        return new MenuViewer(getModel());
    }

    @Override
    protected Controller<InitialMenu> getController() {
        return new MenuController(getModel());
    }

}
