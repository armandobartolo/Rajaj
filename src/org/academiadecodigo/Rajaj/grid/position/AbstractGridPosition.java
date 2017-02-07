package org.academiadecodigo.Rajaj.grid.position;

import org.academiadecodigo.Rajaj.grid.Grid;

/**
 * Created by apm on 06-02-2017.
 */
public abstract class AbstractGridPosition implements GridPosition {

    private int width;
    private int height;
    private Grid grid;


    public AbstractGridPosition(int width, int height, Grid grid) {
        this.width = width;
        this.height = height;
        this.grid = grid;

    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
    public Grid getGrid() {
        return grid;
    }



    @Override
    public void moveInDirection(int distance) {

    }

    @Override
    public boolean equals(GridPosition pos) {
        return this.width == pos.getWidth() && this.height == pos.getHeight() ? true : false;
    }



    public void moveLeft(int dist) {



    }



}
