package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.CollisionDetector;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by apm on 08-02-2017.
 */
public class Floor extends GameObject implements Hittable{

    public Floor(GridPosition pos) {
        super(pos, ObjType.FLOOR);
    }


    @Override
    public boolean isHittable() {
        return true;
    }
}




