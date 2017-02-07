package org.academiadecodigo.Rajaj.grid.position;

import org.academiadecodigo.Rajaj.grid.Grid;

/**
 * Created by apm on 06-02-2017.
 */
public abstract class AbstractGridPosition implements GridPosition {

    private int col;
    private int row;
    private Grid grid;

    /**
     * Construct a new grid position at a specific column and row
     *
     * @param col   the column of the grid position
     * @param row   the row of the grid position
     * @param grid  the grid in which the position will be displayed
     */

    public AbstractGridPosition(int col, int row, Grid grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;

    }

    public AbstractGridPosition() {
    }


    public Grid getGrid() {
        return grid;
    }


    @Override
    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
        show();
    }

    /**
     * @see GridPosition#getCol()
     */
    @Override
    public int getCol() {
        return col;
    }

    /**
     * @see GridPosition#getRow()
     */
    @Override
    public int getRow() {
        return row;
    }

    @Override
    public void moveInDirection(int distance) {

    }

    @Override
    public boolean equals(GridPosition pos) {
        return this.col == pos.getCol() && this.row == pos.getRow() ? true : false;
    }



    public void moveLeft(int dist) {



    }



}
