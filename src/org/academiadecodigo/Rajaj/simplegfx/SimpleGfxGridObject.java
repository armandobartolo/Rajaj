package org.academiadecodigo.Rajaj.simplegfx;

import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.GridImage;
import org.academiadecodigo.Rajaj.grid.position.AbstractGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Simple graphics position
 */
public class SimpleGfxGridObject extends AbstractGridPosition {

    private Picture pic;
    private SimpleGfxGrid simpleGfxGrid;
    private String image;



    public SimpleGfxGridObject(int width, int height, SimpleGfxGrid grid, ObjType image) {

        super(width,height,grid);
        this.simpleGfxGrid=grid;
        this.image=image.getImage().getpath();
        this.pic = new Picture(width, height, this.image);
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

        pic.translate(0,-14);
        pic.draw();
    }

    @Override
    public void moveDown() {
        pic.translate(0,7);
        pic.draw();
    }

    @Override
    public void move() {

        pic.delete();
        pic.translate(-10, 0);

        pic.draw();
    }

    @Override
    public double getX() {
        return pic.getX();
    }

    @Override
    public double getY() {
        return pic.getY();
    }

    /*@Override
    public void setImage(ObjType type){

        this.image=type.getImage().getpath();
        this.pic = new Picture(width, height, this.image);//makes sense --'

    }*/


}
