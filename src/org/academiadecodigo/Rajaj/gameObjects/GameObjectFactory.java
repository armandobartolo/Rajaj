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

        int placement = ObjType.values().length-1;
        ObjType objType = ObjType.values()[placement];

        GameObject gameObject;

        switch (objType) {
            case TRIANGLE:
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
                break;
            default:
                gameObject = new Blank(grid.makeGridPosition(0,0));

        }
        return gameObject;
    }


}


