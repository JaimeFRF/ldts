package controller;

import viewer.Viewer;
import com.tomb.git.Game;
import gui.Gui;

import java.awt.*;
import java.io.IOException;

public abstract class Controller<T> {

    private T model;
    public Controller(T model){this.model = model;}

    public T getModel(){
        return model;
    }

    public abstract void step(Game game, Gui.ACTION action, Viewer viewer, Gui gui) throws IOException, FontFormatException;

}
