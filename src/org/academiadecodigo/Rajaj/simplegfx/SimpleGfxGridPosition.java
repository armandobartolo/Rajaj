package org.academiadecodigo.Rajaj.simplegfx;

import org.academiadecodigo.Rajaj.grid.position.AbstractGridPosition;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Picture pic;
    private Picture[] pic2= new Picture[16];
    private SimpleGfxGrid simpleGfxGrid;


    public SimpleGfxGridPosition(int width, int height, SimpleGfxGrid grid) {

        super(height,width,grid);
        this.simpleGfxGrid=grid;

        pic = new Picture(140, 440, "resources/player.png");
        for (int i = 0; i < 16; i++) {

            pic2[i] = new Picture(10 + (i*70), 500, "resources/floor.png");

        }

        show();
    }


    @Override
    public void show() {
        //rectangle.draw();
        pic.draw();
        for (int i = 0; i < 16 ; i++) {
            pic2[i].draw();

        }

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

    }



}
