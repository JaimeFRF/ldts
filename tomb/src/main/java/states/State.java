package states;

import viewer.Viewer;
import com.tomb.git.Game;
import controller.Controller;
import gui.Gui;

import java.awt.*;
import java.io.IOException;


public abstract class State<T>{

    private final T model;
    private final Controller<T> controller;
    private final Viewer<T> viewer;

    public State(T model){
        this.model = model;
        this.viewer = getViewer();
        this.controller = getController();
    }

    public T getModel(){
        return model;
    }

    protected abstract Viewer<T> getViewer();

    protected abstract Controller<T> getController();

    public void step(Game game, Gui gui) throws IOException, FontFormatException {
        Gui.ACTION action= gui.getNextAction();
        controller.step(game, action, viewer, gui);
        viewer.draw(gui);
    }

}
