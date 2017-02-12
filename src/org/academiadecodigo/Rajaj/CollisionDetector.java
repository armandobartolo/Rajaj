package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by codecadet on 05/02/17.
 */
public class CollisionDetector {


    private LinkedList<GameObject> list;
    private Player player;
    double x;
    double y;
    double width;
    double height;

    private boolean onTheFloor;
    private boolean isWinner;

    public CollisionDetector(LinkedList<GameObject> list, Player player) {
        this.list = list;
        this.player = player;
    }

    public boolean isOnTheFloor(){
        return onTheFloor;
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
           // System.out.println(g);



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


            //      overflow || intersect

            /* if (gw + 70 > px &&
                    gh > py + 70 &&
                    pw > gx &&
                    ph > gy) {

                System.out.println("aqui");

                return true;
            } */
            if (gx > px && gx < pw && gy > ph && gy > py) {
                return true;
            }
        }

        return false;
    }




//MUITO IMPORTANTE (tem uma brincadeirinha pra fazer os rectangulos com que chocarem ficarem magenta e depois voltarem a cinzento)
/*
    public boolean isCrashed(GameObject[] r, double x, double y) {
        for (GameObject gameObject : r) {
            if (isCrashed(gameObject , x, y)) {
                if(gameObject instanceof Player){
                    isCrashed = true;
                }

                return true;
            }
            if(shape instanceof Rectangle) {
                ((Rectangle) shape).setColor(Color.LIGHT_GRAY);
                ((Rectangle) shape).fill();
            }
        }
        return false;
    }
*/
}
