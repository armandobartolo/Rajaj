package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.GameObject;
import org.academiadecodigo.Rajaj.gameObjects.GameObjectFactory;
import org.academiadecodigo.Rajaj.grid.Grid;
import org.academiadecodigo.Rajaj.grid.GridFactory;

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
    private GameObject[] gameObjects;
    private int number= 4;



    Game(int width, int height){
        grid=GridFactory.makeGrid(width,height);
    }

    public void init() {

        grid.init();

        gameObjects = new GameObject[number];

        this.player = new Player(grid.makeGridPosition(140, 440));
        this.level = new GameLevel();
        //this.collisionDetector = new CollisionDetector();

        for (int i = 0; i < number; i++) {

            gameObjects[i] = GameObjectFactory.getNewGameObject(grid);
            //gameObjects[i].setCollisionDetector(collisionDetector);
            gameObjects[i].setGrid(grid);

        }


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
