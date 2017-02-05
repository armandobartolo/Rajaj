package org.academiadecodigo.Rajaj.grid;

/**
 * Created by codecadet on 05/02/17.
 */
public interface GridPosition {

    public int getCol();

    public  int getRow();

    public void setPos();

    public GridColor getColor();

    public void setColor(GridColor color);

    public void show();

    public void hide();

    public void moveInDirection(GridDirection direction, int distance);

    public boolean equals(GridPosition position);

}
