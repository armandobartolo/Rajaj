package org.academiadecodigo.Rajaj.grid.position;

import org.academiadecodigo.Rajaj.gameObjects.ObjType;

/**
 * Created by codecadet on 05/02/17.
 */
public interface GridPosition {

    public int getWidth();

    public  int getHeight();

    public void setImage(ObjType image);

    public void show();

    public void hide();

    void moveUp();

    void moveDown();

    public void moveInDirection(int distance);

    public boolean equals(GridPosition position);

}
