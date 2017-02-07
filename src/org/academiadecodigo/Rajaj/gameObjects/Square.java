package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by codecadet on 05/02/17.
 */
public class Square extends GameObject implements Hittable {

    private int size;

    public Square(GridPosition pos){
        super(pos, ObjType.SQUARE);
    }



}
