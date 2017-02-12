package org.academiadecodigo.Rajaj.gameObjects;

/**
 * Created by codecadet on 05/02/17.
 */
public enum ObjType {

    TRIANGLE("resources/flame1.png"),
    SQUARE("resources/platform.png"),
    BLANK("resources/blank.png"),
    SPECIALBLANK("resources/blank.png"),
    FINISHLINE("resources/finishline.png"),
    PLAYER("resources/bee.png"),
    FLOOR("resources/floor.png");


    private String path;

    ObjType(String path) {
        this.path = path;
    }

    public String getImage() {
        return path;
    }
}
