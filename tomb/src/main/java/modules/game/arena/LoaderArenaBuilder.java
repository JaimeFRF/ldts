package modules.game.arena;

import com.tomb.git.FileReader;
import modules.game.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoaderArenaBuilder extends ArenaBuilder {

    private  List<String> file;

    public LoaderArenaBuilder(int level) throws IOException {
        switch (level) {
            case 1 -> file = new FileReader().readFile("./src/main/resources/textFiles/level1/level1.txt");
            case 2 -> file = new FileReader().readFile("./src/main/resources/textFiles/level2/nivel2.txt");
            case 3 -> file = new FileReader().readFile("./src/main/resources/textFiles/level3/level3.txt");
        }

    }

    @Override
    protected List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();
        String aux;
        for (int i = 0; i < file.size(); i++) { /// i=y && j=x
            aux=file.get(i);
            for(int j=0; j<aux.length();j++){
                if(aux.charAt(j)=='#') {
                    walls.add(new Wall(j, i));
                }
            }
        }
        return walls;
    }

    @Override
    protected List<Spike> createSpikes() {
        List<Spike> spikes = new ArrayList<>();
        String aux;
        for (int i = 0; i < file.size(); i++) { /// i=y && j=x
            aux=file.get(i);
            for(int j=0; j<aux.length();j++){

                if(aux.charAt(j)=='v') {
                    spikes.add(new Spike(j, i));
                }
            }
        }
        return spikes;
    }


    @Override
    protected List<Monster> createMonsters() {
        List<Monster> monsters  = new ArrayList<>();
        String aux;
        for (int i = 0; i < file.size(); i++) { /// i=y && j=x
            aux=file.get(i);
            for(int j=0; j<aux.length();j++){
                if(aux.charAt(j)=='b') {
                    monsters.add(new Monster(j, i));
                }
            }
        }
        return monsters;
    }

    @Override
    protected List<Coin> createCoins() {
        List<Coin> coins = new ArrayList<>();
        String aux;
        for (int i = 0; i < file.size(); i++) { /// i=y && j=x
            aux=file.get(i);
            for(int j=0; j<aux.length();j++){
                if(aux.charAt(j)=='.') {
                    coins.add(new Coin(j, i));
                }
            }
        }
        return coins;
    }

    @Override
    protected List<EmptyTile> createEmptyTiles(){
        List<EmptyTile> emptyTiles = new ArrayList<>();
        String aux;
        for (int i = 0; i < file.size(); i++) { /// i=y && j=x
            aux = file.get(i);
            for(int j=0; j<aux.length();j++){
                if(aux.charAt(j) == ' ' || aux.charAt(j) == '.' || aux.charAt(j) == 'b' || aux.charAt(j)=='v') {
                    emptyTiles.add(new EmptyTile(j, i));
                }
            }
        }
        return emptyTiles;
    }
    @Override
    protected Hero createHero(){
        return new Hero(8,9);
    }


}
