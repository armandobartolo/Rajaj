package org.academiadecodigo.Rajaj.simplegfx;

import org.academiadecodigo.Rajaj.grid.Grid;
//import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;

    private final int px = 20;
    private int width;
    private int height;
    private Rectangle rect;


    public SimpleGfxGrid(int cols, int rows) {
        this.width = (cols * px);
        this.height = (rows * px);
    }

    @Override
    public void init(int number, int number1) {

        rect = new Rectangle(PADDING, PADDING, width, height);
        rect.draw();

    }


    @Override
    public int getCols() {
        return (width / px);
    }

    @Override
    public int getRows() {
        return (height / px);
    }


    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }


    public int getX() {

        return rect.getX();
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     *
     * @return the y position of the grid
     */
    public int getY() {

        return rect.getY();
    }

    /**
     * Obtains the pixel width and height of a grid position
     *
     * @return
     */
    public int getCellSize() {

        return px;
    }

   /*
    @Override
    public GridPosition makeGridPosition() {

        return new SimpleGfxGridPosition(this);

    }

    /**
     * @see Grid#makeGridPosition(int, int)
     */
   /*
    @Override
    public GridPosition makeGridPosition(int col, int row) {

        return new SimpleGfxGridPosition(col, row, this);
    }*/


    public int rowToY(int row) {
        return (row * px) + PADDING;
    }


    public int columnToX(int column) {
        return (column * px) + PADDING;

    }
}
