package org.academiadecodigo.Rajaj.gameObjects;

/**
 * Created by codecadet on 05/02/17.
 */
public enum ObjType {

    TRIANGLE("resources/flame1.png"),
    SQUARE("resources/platform.png"),
    BLANK("resources/flame2.png"),
    //SPECIALBLANK(""),
    FINISHLINE("resources/finishline.png"),
    PLAYER("resources/player.png"),
    FLOOR("resources/floor.png");


    private String path;

    ObjType(String path) {
        this.path = path;
    }

    public String getImage() {
        return path;
    }
}
