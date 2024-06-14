package viewerTest.game;
import viewer.game.CoinViewer;
import gui.Gui;
import modules.game.Coin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CoinViewerTest {

    private Coin coin;
    private CoinViewer coinViewer;
    private Gui gui;

    @BeforeEach
    public void helper(){
        coin = new Coin(7,8);
        coinViewer = new CoinViewer();
        gui = Mockito.mock(Gui.class);
    }

    @Test
    public void drawTest(){
        coinViewer.draw(coin, gui);
        Mockito.verify(gui, Mockito.times(1)).drawCoin(coin.getPosition());
    }


}
