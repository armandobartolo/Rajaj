package org.academiadecodigo.Rajaj.grid;

/**
 * Created by codecadet on 12/02/17.
 */
public enum GridImage {

    BEE("resources/bee.png"),
    BLANK("resources/blank.png"),
    FLAME("resources/flame1.png"),
    FLOOR("resources/floor.png"),
    PLATFORM("resources/platform.png"),
    FINISHLINE(" "),
    BACKGROUND("resources/background.png"),
    MENU("resources/menu.png"),
    GAMEOVER("resources/gameover.png");


    private String path;

    GridImage(String path) {
        this.path = path;
    }

    public String getpath() {
        return path;
    }
}



