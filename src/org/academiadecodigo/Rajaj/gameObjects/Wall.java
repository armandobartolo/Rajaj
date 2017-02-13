package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by codecadet on 13/02/17.
 */
public class Wall extends GameObject {


    public Wall(GridPosition position) {
        super(position,ObjType.WALL);
    }

    @Override
    public void move() {

    }
}
