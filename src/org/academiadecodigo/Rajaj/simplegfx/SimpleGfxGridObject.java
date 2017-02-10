package org.academiadecodigo.Rajaj.simplegfx;

<<<<<<< HEAD:src/org/academiadecodigo/Rajaj/simplegfx/SimpleGfxGridObject.java
=======
import com.sun.org.apache.bcel.internal.generic.ObjectType;
>>>>>>> cb0975dd1add05fa6668884ef3264e729732d162:src/org/academiadecodigo/Rajaj/simplegfx/SimpleGfxGridPosition.java
import org.academiadecodigo.Rajaj.grid.GridImage;
import org.academiadecodigo.Rajaj.grid.position.AbstractGridPosition;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Simple graphics position
*/

public class SimpleGfxGridObject extends AbstractGridPosition {

    private Picture pic;
    private SimpleGfxGrid simpleGfxGrid;
<<<<<<< HEAD:src/org/academiadecodigo/Rajaj/simplegfx/SimpleGfxGridObject.java
    private String image = GridImage.BEE.getPath();


    public SimpleGfxGridObject(int width, int height, SimpleGfxGrid grid,) {

        super(height,width,grid);
        this.simpleGfxGrid=grid;
=======
    private ObjectType type;


    public SimpleGfxGridPosition(int width, int height, SimpleGfxGrid grid , ObjectType type) {

        super(height,width,grid);
        this.simpleGfxGrid=grid;
        this.type = type; // contrutor a receber imagem
        this.pic = new Picture(width, height, type.);
>>>>>>> cb0975dd1add05fa6668884ef3264e729732d162:src/org/academiadecodigo/Rajaj/simplegfx/SimpleGfxGridPosition.java
        show();
    }


    @Override
    public void show() {
        pic.draw();
    }

<<<<<<< HEAD:src/org/academiadecodigo/Rajaj/simplegfx/SimpleGfxGridObject.java
    /**
     * @see GridPosition#hide()
    */
=======

>>>>>>> cb0975dd1add05fa6668884ef3264e729732d162:src/org/academiadecodigo/Rajaj/simplegfx/SimpleGfxGridPosition.java
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

<<<<<<< HEAD:src/org/academiadecodigo/Rajaj/simplegfx/SimpleGfxGridObject.java



=======
    }
>>>>>>> cb0975dd1add05fa6668884ef3264e729732d162:src/org/academiadecodigo/Rajaj/simplegfx/SimpleGfxGridPosition.java
}
