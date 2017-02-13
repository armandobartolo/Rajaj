package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.grid.Grid;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;


/**
 * Created by codecadet on 05/02/17.
 */
public abstract class GameObject {


    private GridPosition gridPosition;
    private Grid grid;
    private ObjType objType;
    private boolean crashed;


    public GameObject(GridPosition pos, ObjType objType){
        gridPosition = pos;
        this.objType = objType;

    }

    public Grid getGrid() {
        return grid;
    }


    public GridPosition getGridPosition() {

        return gridPosition;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }


    public GridPosition getPos() {
        return gridPosition;
    }


    public boolean isCrashed() {
        return crashed;
    }

    public boolean setCrashed(){
        return crashed = true;
    }

    public void move() {

        getPos().move();


    }

}


