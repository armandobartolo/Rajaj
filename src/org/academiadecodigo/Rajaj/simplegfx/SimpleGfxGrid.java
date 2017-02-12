package org.academiadecodigo.Rajaj.simplegfx;

import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.Grid;
import org.academiadecodigo.Rajaj.grid.GridImage;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;

    private final int px = 70;
    private int width;
    private int height;
    private Picture pic;
    private Rectangle rect;


    public SimpleGfxGrid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void init(GridImage image) {

        pic = new Picture(PADDING, PADDING, image.getpath());
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


    public void delete() {
        pic.delete();
    }

    /**
     * Obtains the pixel width and height of a grid position
     *
     * @return
     */
    public int getCellSize() {

        return px;
    }


    public GridPosition makeGridPosition(int width, int height, ObjType image) {

        return new SimpleGfxGridObject(width, height, this, image);

    }


    public int rowToY(int row) {
        return (row * px) + PADDING;
    }


    public int columnToX(int column) {
        return (column * px) + PADDING;

    }


}
