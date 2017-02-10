package org.academiadecodigo.Rajaj.simplegfx;

import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.position.AbstractGridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Simple graphics position
 */
public class SimpleGfxGridObject extends AbstractGridPosition {

    private Picture pic;
    private SimpleGfxGrid simpleGfxGrid;



    public SimpleGfxGridObject(int width, int height, SimpleGfxGrid grid, ObjType image) {

        super(height,width,grid);
        this.simpleGfxGrid=grid;
        this.pic = new Picture(width, height, image.getImage());
        show();
    }


    @Override
    public void show() {

        pic.draw();

    }

    @Override
    public void hide() {

        pic.delete();
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveInDirection( int distance) {

           // pic2[].translate(-10,0);

    }

    @Override
    public void setImage(ObjType image) {
        super.setImage(image);
        pic = new Picture(getWidth(), getHeight(), image.getImage());
    }



}
