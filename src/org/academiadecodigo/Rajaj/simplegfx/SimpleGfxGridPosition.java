package org.academiadecodigo.Rajaj.simplegfx;

import com.sun.org.apache.bcel.internal.generic.ObjectType;
import org.academiadecodigo.Rajaj.grid.GridImage;
import org.academiadecodigo.Rajaj.grid.position.AbstractGridPosition;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Picture pic;
    private SimpleGfxGrid simpleGfxGrid;
    private ObjectType type;


    public SimpleGfxGridPosition(int width, int height, SimpleGfxGrid grid , ObjectType type) {

        super(height,width,grid);
        this.simpleGfxGrid=grid;
        this.type = type; // contrutor a receber imagem
        this.pic = new Picture(width, height, type.);
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


    }

    @Override
    public void setImage(GridImage image) {
        super.setImage(image);
        this.image = image;

    }
}
