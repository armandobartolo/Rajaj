package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.grid.GridColor;
import org.academiadecodigo.Rajaj.grid.GridImage;

/**
 * Created by codecadet on 05/02/17.
 */
public enum ObjType {

    TRIANGLE(GridImage.FIRE),
    SQUARE(GridImage.PLATFORM),
    BLANK(GridImage.BLANK),
    FINISHLINE(GridImage.FINISHEDLINE),
    PLAYER(GridImage.BEE),
    FLOOR(GridImage.FLOOR);


    private GridImage image;

    ObjType(GridImage image) {
        this.image = image;
    }

    public GridImage getColor() {
        return this.image;
    }
}
