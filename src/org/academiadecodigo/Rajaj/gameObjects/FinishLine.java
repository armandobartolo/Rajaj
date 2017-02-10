package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by codecadet on 05/02/17.
 */
public class FinishLine extends GameObject implements Hittable{

    private int size;

    public FinishLine(GridPosition pos){

        super(pos, ObjType.FINISHLINE);
    }



    @Override
    public boolean isHittable() {
        return false;
    }


}
