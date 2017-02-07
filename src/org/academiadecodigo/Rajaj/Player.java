package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.GameObject;
import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.Grid;
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

        /*switch(key)
        {
            case KeyboardEvent.KEY_UP:


        }*/

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }




}
