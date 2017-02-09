package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.Player;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;


/**
 * Created by codecadet on 05/02/17.
 */
public class Triangle extends GameObject implements Hittable {

<<<<<<< HEAD
    public Triangle(GridPosition pos){
        super(pos, ObjType.TRIANGLE);
    }
=======
    private int size;


    public Triangle(GridPosition pos){
        super(pos, ObjType.TRIANGLE);
    }


    @Override
    public boolean isHittable() {
        return true;
    }
>>>>>>> de9a58866dfcc9ce19af61c076d315a1aaeb40fa
}
