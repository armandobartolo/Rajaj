package org.academiadecodigo.Rajaj.grid.position;

import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.Grid;

/**
 * Created by apm on 06-02-2017.
 */
public abstract class AbstractGridPosition implements GridPosition {

    private int width;
    private int height;
    private Grid grid;
    private String image;


    public AbstractGridPosition(int width, int height, Grid grid) {
        this.width = width;
        this.height = height;
        this.grid = grid;
        this.image=ObjType.BLANK.getImage();

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


    @Override
    public void setImage(ObjType type) {
        //this.image=type.getImage();
        show();
    }

    @Override
    public boolean equals(GridPosition pos) {
        return this.width == pos.getWidth() && this.height == pos.getHeight() ? true : false;
    }
}
