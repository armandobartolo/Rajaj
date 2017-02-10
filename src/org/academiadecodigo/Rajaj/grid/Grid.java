package org.academiadecodigo.Rajaj.grid;


import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by codecadet on 05/02/17.
 */
public interface Grid {


    public void init();

    public int getWidth();

    public int getHeight();

    public GridPosition makeGridPosition(int width, int height, ObjType image);



}
