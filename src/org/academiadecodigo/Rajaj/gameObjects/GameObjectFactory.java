package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.grid.Grid;


/**
 * Created by codecadet on 05/02/17.
 */
public class GameObjectFactory {

    public static GameObject getNewGameObject(Grid grid, int width, int height, ObjType type) {

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
                gameObject = new Floor(grid.makeGridPosition(width, height, ObjType.FLOOR));
                break;
            case SPECIALBLANK:
                gameObject = new SpecialBlank(grid.makeGridPosition(width, height, ObjType.SPECIALBLANK));
                break;
            case WALL:
                gameObject = new Wall(grid.makeGridPosition(width, height, ObjType.WALL));
                break;
            default:
                gameObject = new Blank(grid.makeGridPosition(width, height, ObjType.BLANK));

        }
        return gameObject;
    }
}


