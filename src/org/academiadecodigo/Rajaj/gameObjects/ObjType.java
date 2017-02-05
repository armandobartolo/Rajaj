package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.grid.GridColor;

/**
 * Created by codecadet on 05/02/17.
 */
public enum ObjType {

    TRIANGLE(GridColor.LIGHT_GREEN),
    SQUARE(GridColor.DARK_GREEN),
    BLANK(GridColor.NO_COLOR),
    PLAYER(GridColor.YELLOW);


    private GridColor color;

    ObjType(GridColor color) {
        this.color = color;
    }

    public GridColor getColor() {
        return this.color;
    }
}