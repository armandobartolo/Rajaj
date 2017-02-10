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



    public SimpleGfxGridPlayer(int width, int height, SimpleGfxGrid grid) {

        super(height,width,grid);
        this.simpleGfxGrid=grid;
        this.pic = new Picture(140, 440, );
        show();
    }

    public Picture getPic() {
        return pic;
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
        pic.translate(0, -14);
    }
    @Override
    public void moveDown() {
        pic.translate(0, 7);
    }

    @Override
    public void moveInDirection( int distance) {

            int i=distance;
            pic.translate(-7,0);

    }

    @Override
    public void setImage(GridImage image) {

        super.setImage(image);
        pic = new Picture(getWidth(), getHeight(), image.getPath());
    }



}
