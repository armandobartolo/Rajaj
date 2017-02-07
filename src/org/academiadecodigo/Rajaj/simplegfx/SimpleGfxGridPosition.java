package org.academiadecodigo.Rajaj.simplegfx;

import org.academiadecodigo.Rajaj.grid.GridColor;
import org.academiadecodigo.Rajaj.grid.position.AbstractGridPosition;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;


    public SimpleGfxGridPosition(SimpleGfxGrid grid) {

        this.simpleGfxGrid=grid;



    }


    @Override
    public void show() {
        //rectangle.draw();
        rectangle.fill();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {

        rectangle.delete();
    }

    @Override
    public void moveInDirection( int distance) {

        //hide();
        int x = simpleGfxGrid.columnToX(getCol()) - SimpleGfxGrid.PADDING;
        int y = simpleGfxGrid.rowToY(getRow()) - SimpleGfxGrid.PADDING;

        super.moveInDirection(distance);

        int x1 = simpleGfxGrid.columnToX(getCol()) - SimpleGfxGrid.PADDING;
        int y1 = simpleGfxGrid.rowToY(getRow()) - SimpleGfxGrid.PADDING;

        rectangle.translate((x1 - x), (y1 - y));

        show();
    }



}
