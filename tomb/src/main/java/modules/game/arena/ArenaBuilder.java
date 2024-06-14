package modules.game.arena;
import modules.game.*;
import java.util.List;

public abstract class ArenaBuilder {

    public Arena createArena(int level){
        Arena arena = new Arena(level);

        arena.setCoins(createCoins());
        arena.setWalls(createWalls());
        arena.setMonsters(createMonsters());
        arena.setHero(createHero());
        arena.setEmptyTiles(createEmptyTiles());
        arena.setSpikes(createSpikes());

        return arena;
    }


    protected abstract List<Wall> createWalls();
    protected abstract List<Spike> createSpikes();

    protected abstract List<Monster> createMonsters();
    protected abstract List<Coin> createCoins();

    protected abstract List<EmptyTile> createEmptyTiles();
    protected abstract Hero createHero();


}
