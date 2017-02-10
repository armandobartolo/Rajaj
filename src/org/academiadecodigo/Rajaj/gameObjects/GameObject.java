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
        pos.setImage(objType);
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

    public void accelerate(int speed) {

        /*if (isCrashed()) {
            return;
        }

        GridDirection newDirection = direction;

        // Perform a U turn if we have bumped against the wall
        if (isHittingWall()) {
            newDirection = direction.oppositeDirection();
        }*/

        // Accelerate in the choosen direction
        for (int i = 0; i < speed; i++) {
            getPos().moveInDirection(1);
            /*if (collisionDetector.isUnSafe(getPos())) {
                crash();
                break;
            }*/
        }

    }
    public boolean isCrashed() {
        return crashed;
    }

    public boolean setCrashed(){
        return crashed = true;
    }

    public void move() {

        accelerate(-7);

    }


}


