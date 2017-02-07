package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.CollisionDetector;
import org.academiadecodigo.Rajaj.grid.Grid;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by codecadet on 05/02/17.
 */
public abstract class GameObject {



    private GridPosition gridPosition;
    private Grid grid;
    private ObjType objType;

    // Allow direct access from subclasses
    protected CollisionDetector collisionDetector;

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

    public CollisionDetector getCollisionDetector() {
        return collisionDetector;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }


    public void move() {


    }
}

/**

 */
