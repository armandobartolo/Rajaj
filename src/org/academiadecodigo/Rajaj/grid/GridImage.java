package org.academiadecodigo.Rajaj.grid;

/**
 * Created by apm on 08-02-2017.
 */
public enum GridImage {

    BEE("resouces/bee.png"),

    FIRE("resouces/fire.png"),

    PLATFORM("resources/platform.png"),

    FLOOR("resources/floor.png"),

    FINISHEDLINE("resources/finishline.png"),

    BLANK("resources/blank.png");


    private String path;


    GridImage(String path) {
        this.path=path;
    }


    public String getPath(){
        return path;
    }
}
