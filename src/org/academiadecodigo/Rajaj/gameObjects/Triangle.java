package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.Player;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;


/**
 * Created by codecadet on 05/02/17.
 */
public class Triangle extends GameObject implements Hittable {

<<<<<<< HEAD
=======

    public Triangle(GridPosition pos){
        super(pos, ObjType.TRIANGLE);
    }

    private int size;

    @Override
    public boolean isHittable() {
        return false;
    }
>>>>>>> cb0975dd1add05fa6668884ef3264e729732d162

/*
    public Triangle(GridPosition pos){
        super(pos, ObjType.TRIANGLE);
    }
*/

    private int size;


<<<<<<< HEAD
    @Override
    public boolean isHittable() {
        return true;
    }

=======
>>>>>>> cb0975dd1add05fa6668884ef3264e729732d162
}
