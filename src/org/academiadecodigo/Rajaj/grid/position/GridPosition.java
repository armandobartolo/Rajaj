package org.academiadecodigo.Rajaj.grid.position;

import org.academiadecodigo.Rajaj.grid.GridImage;

/**
 * Created by codecadet on 05/02/17.
 */
public interface GridPosition {

    public int getWidth();

    public  int getHeight();

    //public void setPos(int height, int width);
    public void setImage(GridImage image);

    public void show();

    public void hide();

    void moveUp();

    void moveDown();

    public void moveInDirection(int distance);

    public boolean equals(GridPosition position);

}
