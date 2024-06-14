package states;

import viewer.Viewer;
import viewer.menu.InstructionsViewer;
import controller.Controller;
import controller.menu.InstructionsController;
import modules.menu.InstructionsMenu;

public class InstructionsState extends State<InstructionsMenu> {

    public InstructionsState(InstructionsMenu instructionsMenu){super(instructionsMenu);}
    @Override
    protected Viewer<InstructionsMenu> getViewer() {
        return new InstructionsViewer(new InstructionsMenu());
    }

    @Override
    protected Controller<InstructionsMenu> getController() {
        return new InstructionsController(new InstructionsMenu());
    }
}
