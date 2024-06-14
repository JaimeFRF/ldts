package com.tomb.git;

import gui.Lanterna;
import modules.menu.InitialMenu;
import states.MenuState;
import states.State;

import java.awt.*;
import java.io.IOException;

public class Game{
    private final Lanterna gui;
    private State state;

    public Game() throws IOException, FontFormatException {
        gui = new Lanterna(52,50);
        this.state = new MenuState(new InitialMenu());
    }

    public void run() throws IOException, FontFormatException {
        int fps = 10;
        int frameTime = 1000/fps;

        while(this.state != null){
            long startTime = System.currentTimeMillis();
            state.step(this, gui);
            long elapsedTime = System.currentTimeMillis() - startTime;
            long sleepTime = frameTime - elapsedTime;

            try{
                if(sleepTime > 0 ) Thread.sleep(sleepTime);

            } catch (InterruptedException ignored) {
            }
        }
        gui.close();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){return state;}


}

