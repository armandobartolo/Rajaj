package org.academiadecodigo.Rajaj.simplegfx;

import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.Grid;
import org.academiadecodigo.Rajaj.grid.GridImage;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;
    private int width;
    private int height;
    private Picture pic;


    public SimpleGfxGrid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void init(GridImage image) {

        pic = new Picture(PADDING, PADDING, image.getpath());
        pic.draw();

    }

    public void delete() {
        pic.delete();
        pic = null;
    }

    public GridPosition makeGridPosition(int width, int height, ObjType image) {

        return new SimpleGfxGridObject(width, height, this, image);

    }

}
