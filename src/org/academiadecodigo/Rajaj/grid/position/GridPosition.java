package org.academiadecodigo.Rajaj.grid.position;

import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.GridImage;

/**
 * Created by codecadet on 05/02/17.
 */
public interface GridPosition {

    double getX();

    double getY();

    void show();

    void hide();

    void moveUp();

    void moveDown();

    void move();

    //public void setImage(ObjType type);


}
