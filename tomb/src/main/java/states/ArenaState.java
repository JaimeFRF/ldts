package states;

import viewer.Viewer;
import controller.ArenaController;
import controller.Controller;
import modules.game.arena.Arena;
import viewer.game.ArenaViewer;


public class    ArenaState extends State<Arena> {

    public ArenaState(Arena arena){
        super(arena);
    }
    @Override
    protected Viewer getViewer() {
        return new ArenaViewer(getModel());
    }

    @Override
    protected Controller getController() {
        return new ArenaController(getModel());
    }


}
