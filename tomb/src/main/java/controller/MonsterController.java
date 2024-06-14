package controller;

import viewer.Viewer;
import com.tomb.git.Game;
import gui.Gui;
import modules.game.arena.Arena;
import modules.game.Monster;
import modules.game.Position;
import java.util.Random;

public class MonsterController extends Controller<Arena> {

    public MonsterController(Arena arena) {
        super(arena);
    }

    @Override
    public void step(Game game, Gui.ACTION action, Viewer viewer, Gui gui) {

        for (Monster monster : getModel().getMonsters()) {

            Random random = new Random();
            int direction = random.nextInt(4) + 1;
            switch (direction) {
                case 1 -> {
                    Position position = new Position(monster.getPosition().getX() + 1, monster.getPosition().getY());
                    if (getModel().isEmptyTile(position))
                        monster.setPosition(position);
                }
                case 2 -> {
                    Position position = new Position(monster.getPosition().getX() - 1, monster.getPosition().getY());
                    if (getModel().isEmptyTile(position))
                        monster.setPosition(position);
                }
                case 3 -> {
                    Position position = new Position(monster.getPosition().getX(), monster.getPosition().getY() + 1);
                    if (getModel().isEmptyTile(position))
                        monster.setPosition(position);
                }
                case 4 -> {
                    Position position = new Position(monster.getPosition().getX(), monster.getPosition().getY() - 1);
                    if (getModel().isEmptyTile(position))
                        monster.setPosition(position);
                }
            }
        }
    }
}










