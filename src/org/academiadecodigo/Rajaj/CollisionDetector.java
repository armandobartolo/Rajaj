package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.GameObject;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by codecadet on 05/02/17.
 */
public class CollisionDetector {

    private GameObject[] gameObjects;

    public GameObject[] getGameObjects() {
        return gameObjects;
    }
    public CollisionDetector(GameObject[] gameObject){
        this.gameObjects = gameObject;
    }

    public boolean isUnSafe(GridPosition pos) {

        for (GameObject p : gameObjects) {

            if (p.getPos()!= pos && p.getPos().equals(pos)) {
                return true;
            }

        }

        return false;

    }

    public void check(GameObject gameObject) {

        for (GameObject player : gameObjects) {

            // No point in checking collisions with self
            if (player == gameObject) {
                continue;
            }

            if (player.getPos().equals(player.getPos())) {
                player.setCrashed();
            }
        }

    }

}
