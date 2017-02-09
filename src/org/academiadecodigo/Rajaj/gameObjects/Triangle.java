package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.Player;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;


/**
 * Created by codecadet on 05/02/17.
 */
public class Triangle extends GameObject implements Hittable {

    public Triangle(GridPosition pos){
        super(pos, ObjType.TRIANGLE);
    }
}
