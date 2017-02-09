package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.GameObject;
import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import static sun.audio.AudioPlayer.player;

/**
 * Created by codecadet on 05/02/17.
 */
public class Player extends GameObject implements KeyboardHandler{

    private int size;
    private CollisionDetector collisionDetector;


    public Player(GridPosition pos){


        super(pos, ObjType.PLAYER);

        Keyboard k = new Keyboard(this);
        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_SPACE);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);

    }

    @Override
    public void move() {
        jump();


    }

    public void jump() {
        //setPosition();
    }



    public int getSize() {
        return size;
    }
    @Override
    public void keyPressed(KeyboardEvent e) {


        int key=e.getKey();

        switch(key)
        {
            case KeyboardEvent.KEY_UP:



        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

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
