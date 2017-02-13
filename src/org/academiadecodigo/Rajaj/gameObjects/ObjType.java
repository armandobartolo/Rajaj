package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.grid.Grid;
import org.academiadecodigo.Rajaj.grid.GridImage;

/**
 * Created by codecadet on 05/02/17.
 */
public enum ObjType {

    TRIANGLE(GridImage.FLAME),
    SQUARE(GridImage.PLATFORM),
    BLANK(GridImage.BLANK),
    SPECIALBLANK(GridImage.BLANK),
    FINISHLINE(GridImage.FINISHLINE),
    PLAYER(GridImage.BEE),
    FLOOR(GridImage.FLOOR),
    WALL(GridImage.WALL);

    private GridImage image;

    ObjType(GridImage image) {
        this.image = image;
    }

    public GridImage getImage() {
        return image;
    }
}
