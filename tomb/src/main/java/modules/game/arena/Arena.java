package modules.game.arena;
import modules.game.*;
import java.util.ArrayList;
import java.util.List;


public class Arena {
    private Hero hero;
    private final int level;

    private boolean arenaFinished = false;
    private List<Monster> monsters = new ArrayList<>();
    private List<Wall> walls=new ArrayList<>(); //guarda as posições das walls
    private List<Coin> coins = new ArrayList<>(); //guarda as posiçoes das coins
    private List<EmptyTile> emptyTiles = new ArrayList<>(); //guarda as posiçoes das emptyTiles
    private List<Spike> spikes=new ArrayList<>();//guarda as posiçoes dos spikes


    public Arena(int level){this.level = level;}

    public boolean isFinished(){
        return coins.isEmpty() || isMonster() || isSpike();
    }

    public boolean isMonster(){
        for(Monster monster : monsters){
            boolean equals = monster.getPosition().equals(hero.getPosition());
            if(equals) return true;
        }
        return false;
    }

    public boolean isSpike(){
        for(Spike spike : spikes){
            boolean equals = spike.getPosition().equals(hero.getPosition());
            if(equals) return true;
        }
        return false;
    }


    public void moveHero(Position position){
        retrieveCoins(position);
        hero.setPosition(position);

    }

    public boolean isEmptyTile(Position position){
        for(EmptyTile emptyTile : emptyTiles){
            boolean equals = emptyTile.getPosition().equals(position);
            if(equals) return true;
        }
        return false;
    }

    public void retrieveCoins(Position position){
        for(int i = 0;i < coins.size(); i++) {
            boolean equals = coins.get(i).getPosition().equals(position);
            if(equals) coins.remove(i);
        }
    }

    public List<Coin> getCoins(){
        return coins;
    }

    public Hero getHero(){
        return hero;
    }

    public List<Wall> getWalls(){
        return walls;
    }

    public List<Monster> getMonsters(){return monsters;}

    public List<Spike> getSpikes() { return spikes; }


    public void setMonsters(List<Monster> monsters){
        this.monsters = monsters;
    }

    public void setWalls(List<Wall> walls){
        this.walls = walls;
    }

    public void setCoins(List<Coin> coins){
        this.coins = coins;
    }
    public void setSpikes(List<Spike> spikes){
        this.spikes = spikes;
    }

    public void setEmptyTiles(List<EmptyTile> emptyTiles){this.emptyTiles = emptyTiles;}

    public void setHero(Hero hero){
        this.hero = hero;
    }

    public int getLevel(){return level;}

    public boolean getArenaFinished(){
        return arenaFinished;
    }

    public void setArenaFinished(boolean arenaFinished){
        this.arenaFinished = arenaFinished;
    }


}
