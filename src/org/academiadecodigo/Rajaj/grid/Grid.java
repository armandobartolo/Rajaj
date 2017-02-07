package org.academiadecodigo.Rajaj.grid;


import org.academiadecodigo.Rajaj.gameObjects.GameObject;

/**
 * Created by codecadet on 05/02/17.
 */
public interface Grid {


    /**
     * Initializes the grid
     */
    public void init(int number, int number1);

    public int getCols();

    public int getRows();

}
