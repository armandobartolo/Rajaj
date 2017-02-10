package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.GameObject;

/**
 * Created by codecadet on 05/02/17.
 */
public class CollisionDetector {

    private GameObject[] gameObjects;

    double x;
    double y;
    double width;
    double height;

    public GameObject[] getGameObjects() {
        return gameObjects;
    }
    public CollisionDetector(GameObject[] gameObject){
        this.gameObjects = gameObject;
    }

    private boolean onTheFloor;
    private boolean isWinner;
    private boolean isCrashed;

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
    public boolean isCrashed(GameObject gameObject, double x, double y){

        double tx = gameObject.getGridPosition().getX();
        double ty = gameObject.getGridPosition().getY();
        double tw = gameObject.getGridPosition().getWidth() + tx;
        double th = gameObject.getGridPosition().getHeight() + ty;

        if ((  (x>=tx && x<=tw) && (y>=ty && y<=th))){
            //TODO: metodo que vai detectar a posição do objecto

            return true;
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
