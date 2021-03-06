package org.academiadecodigo.Rajaj;

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
public class Player extends GameObject implements KeyboardHandler {

    private boolean jumping;
    private double initialHeight;
    private double actualHeight;


    public Player(GridPosition pos) {

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
    }


    public void jump() {
        actualHeight = super.getGridPosition().getY();

        if (actualHeight - initialHeight >= -140) {
            super.getGridPosition().moveUp();
            actualHeight += 7;
        } else {
            jumping = false;
            actualHeight = super.getGridPosition().getY();
        }
    }


    public void gravity() {

        getGridPosition().moveDown();
    }


    @Override
    public void keyPressed(KeyboardEvent e) {
        jumping = true;
        initialHeight = getGridPosition().getY();
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
}
