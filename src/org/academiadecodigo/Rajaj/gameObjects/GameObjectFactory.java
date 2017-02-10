package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.grid.Grid;


/**
 * Created by codecadet on 05/02/17.
 */
public class GameObjectFactory {

    public static GameObject getNewGameObject(Grid grid, ObjType type,  int width, int height) {

        GameObject gameObject;

        switch (type) {
            case TRIANGLE:
                gameObject = new Triangle(grid.makeGridPosition(width, height, ObjType.TRIANGLE));
                break;
            case SQUARE:
                gameObject = new Square(grid.makeGridPosition(width, height, ObjType.SQUARE));
                break;
            case BLANK:
                gameObject = new Blank(grid.makeGridPosition(width, height, ObjType.BLANK));
                break;
            case FINISHLINE:
                gameObject = new FinishLine(grid.makeGridPosition(width, height, ObjType.FINISHLINE));
                break;
            case FLOOR:
                gameObject = new Floor(grid.makeGridPosition(width,height, ObjType.FLOOR));
            default:
                gameObject = new Blank(grid.makeGridPosition(width,height, ObjType.BLANK));

        }
        return gameObject;
    }
}


