package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.grid.Grid;

/**
 * Created by codecadet on 05/02/17.
 */
public class Game {
    private Grid grid;
    private Player player;
    private boolean winner;
    private boolean crashed;
    private GameLevel level;
    private CollisionDetector collisionDetector;

    public void init() {
        this.player = new Player();
        this.grid = new Grid();
        this.level = new GameLevel();
        this.collisionDetector = new CollisionDetector();


        grid.init(8, 16);



    }

    public GameLevel getLevel() {
        return level;
    }

    public Grid getGrid() {
        return grid;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public boolean isWinner() {
        return winner;
    }

    public void start() {

        while (!winner || !crashed){
            move();
            //TODO: acrescentar thread.sleep

        }
        //TODO: implement collision detector
    }

    private void move() {
        grid.move();
    }
}
