package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.*;
import java.util.LinkedList;


/**
 * Created by codecadet on 05/02/17.
 */
public class CollisionDetector {


    private LinkedList<GameObject> list;
    private Player player;

    public CollisionDetector(LinkedList<GameObject> list, Player player) {
        this.list = list;
        this.player = player;
    }


    /**

     tX - - - - - tW
     |           |
     |     T     |
     |           |
     tY - - - - - tH

     rX - - - - - - - rW
     |               |
     |               |
     |       R       |
     |               |
     |               |
     rY - - - - - - - rH


     */


    //ESTE E O SEGUINTE SÃO OS QUE IMPORTAM
    public boolean isCrashed() {

        for (GameObject g : list) {

            if (g instanceof Blank || g instanceof SpecialBlank || g instanceof Floor) {
                continue;
            }

            double pw = 70;
            double ph = 70;
            double gw = 70;
            double gh = 70;

            double px = player.getGridPosition().getX();
            double py = player.getGridPosition().getY();
            double gx = g.getGridPosition().getX();
            double gy = g.getGridPosition().getY();
            gw += gx;
            gh += gy;
            pw += px;
            ph += py;

            if (gx > px && gx < pw && gh < ph && gh > py) {
                return true;
            }
        }

        return false;
    }




    public boolean isOnTheFloor() {

        for (GameObject g : list) {

            if (g instanceof Blank || g instanceof SpecialBlank || g instanceof Triangle || g instanceof Square) {
                continue;
            }


            double pw = 70;
            double ph = 70;
            double gw = 70;
            double gh = 70;

            double px = player.getGridPosition().getX();
            double py = player.getGridPosition().getY();
            double gx = g.getGridPosition().getX();
            double gy = g.getGridPosition().getY();
            gw += gx;
            gh += gy;
            pw += px;
            ph += py;


            if (gh - 70 < ph && gh - 70 > py) {
                return true;
            }
        }

        return false;
    }

}
