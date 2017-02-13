package org.academiadecodigo.Rajaj.grid;


import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by codecadet on 05/02/17.
 */
public interface Grid {


    void init(GridImage image);

    GridPosition makeGridPosition(int width, int height, ObjType image);

    void delete();


}
