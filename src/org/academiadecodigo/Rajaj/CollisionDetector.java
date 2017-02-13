package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.*;
import java.util.LinkedList;


/**
 * Created by codecadet on 05/02/17.
 */
public class CollisionDetector {


    private LinkedList<GameObject> list;
    private Player player;
    private boolean xalanaMode;

    public boolean isXalanaMode() {
        return xalanaMode;
    }

    public CollisionDetector(LinkedList<GameObject> list, Player player) {
        this.list = list;
        this.player = player;
    }


    /**

     pX - - - - - pW
     |           |
     |     P     |
     |           |
     pY - - - - - pH

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

            if (g instanceof Blank || g instanceof Floor) {
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
                if (g instanceof SpecialBlank) {
                    xalanaMode = true;
                    return false;
                }
                return true;
            }
        }

        return false;
    }




    public boolean isOnTheFloor() {

        for (GameObject g : list) {

            if (g instanceof Blank || g instanceof SpecialBlank || g instanceof Triangle || g instanceof FinishLine) {
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


            if (gy <= ph && px >= gx && px <= gw) {
                return true;
            }
        }

        return false;
    }

}
