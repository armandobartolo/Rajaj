package org.academiadecodigo.Rajaj.simplegfx;

import org.academiadecodigo.Rajaj.grid.GridImage;
import org.academiadecodigo.Rajaj.grid.position.AbstractGridPosition;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPlayer extends AbstractGridPosition {

    private Picture pic;
    private Picture[] pic2= new Picture[60];
    private SimpleGfxGrid simpleGfxGrid;
    private String icon = GridImage.BEE.getPath();


    public SimpleGfxGridPlayer(int width, int height, SimpleGfxGrid grid) {

        super(height,width,grid);
        this.simpleGfxGrid=grid;
        this.pic = new Picture(140, 440, icon);
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
    public void moveInDirection( int distance) {

           // pic2[].translate(-10,0);

    }

    @Override
    public void setImage(GridImage image) {

        super.setImage(image);
        pic = new Picture(getWidth(), getHeight(), image.getPath());
    }



}
