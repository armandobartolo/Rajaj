package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.CollisionDetector;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by codecadet on 05/02/17.
 */
public class Blank extends GameObject{

    public Blank(GridPosition pos){
        super(pos, ObjType.BLANK);
    }


}
