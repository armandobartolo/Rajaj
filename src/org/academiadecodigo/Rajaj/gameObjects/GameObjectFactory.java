package org.academiadecodigo.Rajaj.gameObjects;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import org.academiadecodigo.Rajaj.Player;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.Rajaj.grid.Grid;


/**
 * Created by codecadet on 05/02/17.
 */
public class GameObjectFactory {

    public static GameObject getNewGameObject(Grid grid) {

<<<<<<< HEAD

        int placement = ObjType.values().length;
=======
        int placement = ObjType.values().length-1;
>>>>>>> cb0975dd1add05fa6668884ef3264e729732d162
        ObjType objType = ObjType.values()[placement];

        GameObject gameObject;

        switch (objType) {
            case TRIANGLE:
<<<<<<< HEAD
                gameObject = new Triangle(grid.makeGridPosition(70, 50));
                break;
            case SQUARE:
                gameObject = new Square(grid.makeGridPosition(490, 360));
                break;
            case BLANK:
                gameObject = new Blank(grid.makeGridPosition(0,0));
                break;
            case FINISHLINE:
                gameObject = new FinishLine(grid.makeGridPosition(500, 500));
=======
                gameObject = new Triangle(grid.makeGridPosition(300,449));
                break;
            case SQUARE:
                gameObject = new Square(grid.makeGridPosition(700, 350));
                break;
            case BLANK:
                gameObject = new Blank(grid.makeGridPosition(1000,200));
                break;
            case FINISHLINE:
                gameObject = new FinishLine(grid.makeGridPosition(1050, 300));
>>>>>>> cb0975dd1add05fa6668884ef3264e729732d162
                break;
            case SPECIALBLANK:
                gameObject = new SpecialBlank(grid.makeGridPosition(0,0));
            default:
<<<<<<< HEAD
                gameObject = new Blank(grid.makeGridPosition(400,400));
=======
                gameObject = new Blank(grid.makeGridPosition(0,0));
>>>>>>> cb0975dd1add05fa6668884ef3264e729732d162

        }
        return gameObject;
    }
}


