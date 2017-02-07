package org.academiadecodigo.Rajaj.grid.position;

import org.academiadecodigo.Rajaj.grid.GridColor;

/**
 * Created by codecadet on 05/02/17.
 */
public interface GridPosition {

    public int getCol();

    public  int getRow();

    public void setPos(int col, int row);

    public void show();


    public void hide();

    public void moveInDirection(int distance);

    public boolean equals(GridPosition position);

}
