package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.GameObject;
import org.academiadecodigo.Rajaj.grid.Grid;
import org.academiadecodigo.Rajaj.grid.GridFactory;

/**
 * Created by codecadet on 05/02/17.
 */
public class Game{

    private Grid grid;
    private Player player;
    private boolean winner;
    private boolean crashed;
    private GameLevel level;
    private CollisionDetector collisionDetector;
    private GameObject[] gameObjects;
    private int width;
    private int height;



    Game(int width, int height){
        grid=GridFactory.makeGrid(width,height);
        this.width=width;
        this.height=height;
    }

    public void init() {

        grid.init();

        this.player = new Player(grid.makeGridPosition(width,height));
        this.level = new GameLevel();


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
            allObjectsMove();
            //TODO: acrescentar thread.sleep

        }
        //TODO: implement collision detector
    }

    private void allObjectsMove() {
        //grid.move();

    }
}
