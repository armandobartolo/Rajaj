package org.academiadecodigo.Rajaj.grid.position;

import org.academiadecodigo.Rajaj.gameObjects.ObjType;

/**
 * Created by codecadet on 05/02/17.
 */
public interface GridPosition {

    public double getWidth();

    public  double getHeight();

    public double getX();

    public double getY();

    public void setImage(ObjType image);

    public void show();

    public void hide();

    void moveUp();

    void moveDown();

    public void move();

    public boolean equals(GridPosition position);

}
