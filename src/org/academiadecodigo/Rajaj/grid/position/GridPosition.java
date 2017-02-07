package org.academiadecodigo.Rajaj.grid.position;

import org.academiadecodigo.Rajaj.grid.GridColor;

/**
 * Created by codecadet on 05/02/17.
 */
public interface GridPosition {

    public int getWidth();

    public  int getHeight();

    //public void setPos(int height, int width);

    public void show();

    public void hide();

    public void moveInDirection(int distance);

    public boolean equals(GridPosition position);

}
