package org.academiadecodigo.Rajaj.grid.position;

import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.GridImage;

/**
 * Created by codecadet on 05/02/17.
 */
public interface GridPosition {

    public double getWidth();

    public  double getHeight();

    public double getX();

    public double getY();

    public void show();

    public void hide();

    void moveUp();

    void moveDown();

    public void move();

    //public void setImage(ObjType type);


}
