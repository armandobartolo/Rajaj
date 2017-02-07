package org.academiadecodigo.Rajaj.grid;

import org.academiadecodigo.Rajaj.simplegfx.SimpleGfxGrid;

/**
 * Created by apm on 06-02-2017.
 */
public class GridFactory {

    public static Grid makeGrid(int cols, int rows){

        return (Grid) new SimpleGfxGrid(cols,rows);

    }
}
