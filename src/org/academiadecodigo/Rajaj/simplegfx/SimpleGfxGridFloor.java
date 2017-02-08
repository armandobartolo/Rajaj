package org.academiadecodigo.Rajaj.simplegfx;

import org.academiadecodigo.Rajaj.grid.position.AbstractGridPosition;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by apm on 07-02-2017.
 */
public class SimpleGfxGridFloor extends AbstractGridPosition {

    private Picture[] pic = new Picture[60];
    private SimpleGfxGrid simpleGfxGrid;


    public SimpleGfxGridFloor(int width, int height, SimpleGfxGrid grid) {

        super(height,width,grid);
        this.simpleGfxGrid=grid;

        for (int i = 0; i < 60; i++) {

            this.pic[i] = new Picture(10 + (i*70), 500, "resources/floor.png");

        }

        show();
    }


    @Override
    public void show() {
        //while(index<60)
        //{
        for (int i = 0; i < 16 ; i++) {
            pic[i].draw();

        }
        // }

        // moveInDirection(60);

    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {

        //pic.delete();
    }

    @Override
    public void moveInDirection( int distance) {

        //hide();
        /*int x = simpleGfxGrid.columnToX(getWidth()) - SimpleGfxGrid.PADDING;
        int y = simpleGfxGrid.rowToY(getHeight()) - SimpleGfxGrid.PADDING;

        super.moveInDirection(distance);

        int x1 = simpleGfxGrid.columnToX(getWidth()) - SimpleGfxGrid.PADDING;
        int y1 = simpleGfxGrid.rowToY(getHeight()) - SimpleGfxGrid.PADDING;

        rectangle.translate((x1 - x), (y1 - y));

        show();*/
    }



}
