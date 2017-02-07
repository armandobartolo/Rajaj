package org.academiadecodigo.Rajaj.simplegfx;

import org.academiadecodigo.Rajaj.grid.Grid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;

    private final int px = 100;
    private int width;
    private int height;
    private Picture pic;


    public SimpleGfxGrid(int height, int width) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void init(int number, int width) {

        pic = new Picture(PADDING, PADDING, "resources/beeenv.png");
        pic.draw();

    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }


    public int getX() {

        return pic.getX();
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     *
     * @return the y position of the grid
     */
    public int getY() {

        return pic.getY();
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
