package org.academiadecodigo.Rajaj.grid;


import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by codecadet on 05/02/17.
 */
public interface Grid {


    /**
     * Initializes the grid
     */
    public void init(int height, int width);

    public int getWidth();

    public int getHeight();

    public GridPosition makeGridPosition(int height, int width);

}
