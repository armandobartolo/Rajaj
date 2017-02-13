package org.academiadecodigo.Rajaj.grid.position;

import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.Grid;

/**
 * Created by apm on 06-02-2017.
 */
public abstract class AbstractGridPosition implements GridPosition {

    protected int width;
    protected int height;
    private Grid grid;

    public AbstractGridPosition(int width, int height, Grid grid) {
        this.width = width;
        this.height = height;
        this.grid = grid;

    }

    public double getWidth(){
        return width;
    }


    public double getHeight(){
        return height;
    }


    public Grid getGrid() {
        return grid;
    }


}
