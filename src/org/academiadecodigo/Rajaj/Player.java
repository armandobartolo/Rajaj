package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.GameObject;
import org.academiadecodigo.Rajaj.grid.Grid;

import static sun.audio.AudioPlayer.player;

/**
 * Created by codecadet on 05/02/17.
 */
public class Player extends GameObject{

    private int position;
    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void play() {
        jump();


    }

    public void jump() {
        //setPosition();
    }

    public void setPosition(int row) {

    }


    public int getSize() {
        return size;
    }


}
