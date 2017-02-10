package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.GameObject;
import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.GridImage;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.Rajaj.simplegfx.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
<<<<<<< HEAD
=======
import org.academiadecodigo.simplegraphics.pictures.Picture;
>>>>>>> b0157f6eecf432c7115c0ec95137ef2136fb22c6

/**
 * Created by codecadet on 05/02/17.
 */
public class Player extends GameObject implements KeyboardHandler{

    private int size;
    private CollisionDetector collisionDetector;

<<<<<<< HEAD
=======

>>>>>>> b0157f6eecf432c7115c0ec95137ef2136fb22c6
    public Player(GridPosition pos){


        super(pos, ObjType.PLAYER);

        Keyboard k = new Keyboard(this);
        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_SPACE);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);

    }

    @Override
    public void move() {}

    public void jump() {
        int initialHeight = getGridPosition().getHeight();
        int actualHeight = getGridPosition().getHeight();
        while (actualHeight - initialHeight != 170) {
            getGridPosition().moveUp();
            actualHeight += 7;

        }
    }

    public void gravity() {
        while (!collisionDetector.isOnTheFloor()){
            getGridPosition().moveDown();
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public void keyPressed(KeyboardEvent e) {
            jump();
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
<<<<<<< HEAD
=======

>>>>>>> b0157f6eecf432c7115c0ec95137ef2136fb22c6
    /*public boolean isUnSafe(GridPosition pos) {

        for (GameObject p : gameObjects) {

            if (p.getPos()!= pos && p.getPos().equals(pos)) {
                return true;
            }

        }

        return false;

    }

    // TODO: 10/02/17 Emendar esta merda

    public void check(GameObject gameObject) {

        for (GameObject player : gameObjects) {

            // No point in checking collisions with self
            if (player == gameObject) {
                continue;
            }

            if (player.getPos().equals(gameObject.getPos())) {
                player.setCrashed();
            }
        }

<<<<<<< HEAD
    }*/

=======
    }
*/
>>>>>>> b0157f6eecf432c7115c0ec95137ef2136fb22c6

}
