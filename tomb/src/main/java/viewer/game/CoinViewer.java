package viewer.game;

import gui.Gui;
import modules.game.Coin;

public class CoinViewer implements ElementViewer<Coin> {
    @Override
    public void draw(Coin coin, Gui gui) {
        gui.drawCoin(coin.getPosition());
    }
}
