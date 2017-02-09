package org.academiadecodigo.Rajaj.simplegfx;

import org.academiadecodigo.Rajaj.grid.GridImage;
import org.academiadecodigo.Rajaj.grid.position.AbstractGridPosition;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Simple graphics position
*/

public class SimpleGfxGridObject extends AbstractGridPosition {

    private Picture pic;
    private Picture[] pic2= new Picture[60];
    private SimpleGfxGrid simpleGfxGrid;
    private String image = GridImage.BEE.getPath();


    public SimpleGfxGridObject(int width, int height, SimpleGfxGrid grid) {

        super(height,width,grid);
        this.simpleGfxGrid=grid;
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
