package org.academiadecodigo.Rajaj.simplegfx;

import org.academiadecodigo.Rajaj.grid.position.AbstractGridPosition;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Picture pic;
    private Picture[] pic2= new Picture[60];
    private SimpleGfxGrid simpleGfxGrid;


    public SimpleGfxGridPosition(int width, int height, SimpleGfxGrid grid) {

        super(height,width,grid);
        this.simpleGfxGrid=grid;
        this.pic = new Picture(140, 440, "resources/player.png");
        show();
    }


    @Override
    public void show() {
        //rectangle.draw();

        pic.draw();

    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {

        pic.delete();
    }

    @Override
    public void moveInDirection( int distance) {

            int i=distance;
            pic2[i].translate(-10,0);

    }



}
