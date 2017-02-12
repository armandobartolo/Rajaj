package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.GameObject;
import org.academiadecodigo.Rajaj.gameObjects.GameObjectFactory;
import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.Grid;
import org.academiadecodigo.Rajaj.grid.GridFactory;

import java.util.LinkedList;

/**
 * Created by codecadet on 05/02/17.
 */
public class Game {

    private Grid grid;
    private Player player;
    private int objHeight = 8;
    private int objWidth = 17; //16 visible and 1 off canvas;
    private int objPixelSize = 70;
    private int nextObj = 17; // start here and increments everu time
    private int moveCounter;
    private LinkedList<GameObject> list = new LinkedList<>();
    private CollisionDetector collisionDetector;
    private Sound sound;

    ObjType[] a = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.FLOOR};
    ObjType[] b = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.TRIANGLE, ObjType.FLOOR};
    ObjType[] c = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SQUARE, ObjType.FLOOR};
    ObjType[] d = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.TRIANGLE, ObjType.SQUARE, ObjType.FLOOR};
    ObjType[] e = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SQUARE, ObjType.SQUARE, ObjType.FLOOR};
    ObjType[] f = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SQUARE, ObjType.BLANK, ObjType.FLOOR};
    ObjType[] g = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SQUARE, ObjType.SQUARE, ObjType.SQUARE, ObjType.FLOOR};
    ObjType[] h = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SQUARE, ObjType.BLANK, ObjType.BLANK, ObjType.FLOOR};
    ObjType[] i = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.TRIANGLE, ObjType.SQUARE, ObjType.SQUARE, ObjType.FLOOR};
    ObjType[] j = {ObjType.FINISHLINE, ObjType.FINISHLINE, ObjType.FINISHLINE, ObjType.FINISHLINE, ObjType.FINISHLINE,
            ObjType.FINISHLINE, ObjType.FINISHLINE, ObjType.FLOOR};
    ObjType[] k = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.TRIANGLE, ObjType.SQUARE, ObjType.BLANK, ObjType.FLOOR};
    ObjType[] l = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SQUARE, ObjType.SQUARE, ObjType.BLANK, ObjType.FLOOR};
    ObjType[] m = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.TRIANGLE, ObjType.BLANK, ObjType.FLOOR};
    ObjType[] n = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.TRIANGLE, ObjType.BLANK, ObjType.BLANK, ObjType.FLOOR};

    ObjType[][] level1 = {a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, b, a, a, a, a, a, a, a, a,
            a, a, a, a, a, a, b, b, a, a, a, a, a, a, a, a, a, a, a, a, a, a, c, c, c, c,
            c, c, c, a, a, a, a, a, a, a, a, a, c, c, c, a, a, a, a, a, a, a, a, a, a, c,
            c, c, c, c, c, c, d, a, a, a, a, a, a, a, a, a, a, a, a, a, c, c, c, c, c, c,
            c, e, f, f, f, a, g, g, h, a, a, a, a, a, a, a, a, a, a, a, a, c, c, c, c, c,
            c, d, c, c, c, a, a, a, a, a, a, a, a, a, a, a, a, a, b, b, a, a, a, c, c, c,
            c, c, d, e, e, e, i, h, h, h, h, a, a, a, a, a, a, a, a, a, a, a, a, a, a, b,
            b, a, a, a, a, a, j, a, a, a, a, a, a, a, a, a, a, a, a, a, a};



    Game(int width, int height) {
        grid = GridFactory.makeGrid(width, height);

    }

    public void init() {

        grid.init();
        firstObjects();

        this.player = new Player(grid.makeGridPosition(150, -80, ObjType.PLAYER));
        this.collisionDetector = new CollisionDetector(list, player);
        this.sound = new Sound("/resources/indianaMusic.wav");
        sound.play();

    }


    public Grid getGrid() {
        return grid;
    }




    public void start() {


        while (true) {



            if (collisionDetector.isCrashed()) {
               break;
            }

            if (moveCounter % 7 == 0) {
              nextObject();
            }


            for (GameObject g : list) {
                g.move();
                moveCounter++;

            }

                player.move();

            if (!collisionDetector.isOnTheFloor()) {
                player.gravity();
            }


          /* try {
                Thread.sleep(30);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }*/

        }

    }


    public void firstObjects() {
        int col = 10;
        for (int o = 0; o < objHeight; o++) {
            int row = 10;
            for (int p = 0; p < objWidth; p++) {
                list.add(GameObjectFactory.getNewGameObject(grid,row, col, level1[p][o]));
                row += objPixelSize;
            }
            col += objPixelSize;
        }
    }

    public void nextObject() {
        int row = 10;
        for (int i = 0; i < objHeight; i++) {
            row += objPixelSize;
            list.add(GameObjectFactory.getNewGameObject(grid, 1130, row-70, level1[nextObj][i]));
            list.remove(0).getGridPosition().hide();


        }
        nextObj++;
    }
}
