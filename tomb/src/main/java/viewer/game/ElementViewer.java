package viewer.game;

import gui.Gui;
import modules.Element;

public interface ElementViewer<T extends Element> {
    void draw(T element, Gui gui);
}
