package org.academiadecodigo.Rajaj.simplegfx;

import com.sun.org.apache.regexp.internal.RE;
import org.academiadecodigo.Rajaj.grid.Grid;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;

    private final int px = 70;
    private int width;
    private int height;
    private Picture pic;
    private Rectangle rect;


    public SimpleGfxGrid(int height, int width) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void init() {

        pic = new Picture(PADDING, PADDING, "resources/background.png");
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


    public GridPosition makeGridPosition(int height, int width ) {

        return new SimpleGfxGridPosition(height, width, this );
    }


    public int rowToY(int row) {
        return (row * px) + PADDING;
    }


    public int columnToX(int column) {
        return (column * px) + PADDING;

    }
}
