package org.academiadecodigo.Rajaj;

import com.sun.xml.internal.bind.v2.TODO;
import org.academiadecodigo.Rajaj.gameObjects.GameObject;
import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by codecadet on 05/02/17.
 */
public class Player extends GameObject implements KeyboardHandler{

    private int size;
    private CollisionDetector collisionDetector;
    private boolean jumping;
    private double initialHeight;
    private double actualHeight;
    // TODO: 11/02/17 Add get X and Y 

    public Player(GridPosition pos){

        super(pos, ObjType.PLAYER);

        Keyboard k = new Keyboard(this);
        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_SPACE);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);

    }


    public void move() {

        if (jumping) {
            jump();
        }
       // gravity();
    }

    public void jump() {
        actualHeight = super.getGridPosition().getY();
        System.out.println("in jump" + (actualHeight - initialHeight));


        if (actualHeight - initialHeight >= -170) {
            System.out.println("inicial" + initialHeight + "actual" + actualHeight);
            super.getGridPosition().moveUp();
            actualHeight += 7;
        } else {
            jumping = false;
            actualHeight = super.getGridPosition().getY();
        }
    }

   /* public void gravity() {
        while (!collisionDetector.isOnTheFloor()){
            getGridPosition().moveDown();
        }
    }*/

    public int getSize() {
        return size;
    }

    @Override
    public void keyPressed(KeyboardEvent e) {
        jumping = true;
        initialHeight = getGridPosition().getY();
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
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

    }*/

    }
