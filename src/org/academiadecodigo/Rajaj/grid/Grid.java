package org.academiadecodigo.Rajaj.grid;

import org.academiadecodigo.Rajaj.CollisionDetector;
import org.academiadecodigo.Rajaj.gameObjects.GameObject;

/**
 * Created by codecadet on 05/02/17.
 */
public class Grid {
    private int col;
    private int row;
    private GameObject[] gameObjects;
    private CollisionDetector colisionDetector;



    /**
     * Initializes the grid
     */
    public void init(int row, int col) {
        this.gameObjects = new GameObject[row*col];//array de 128 objectos
        colisionDetector = new CollisionDetector();

    }

    public GameObject[] getGameObjects() {
        return gameObjects;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void move() {


    }
}
