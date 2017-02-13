package org.academiadecodigo.Rajaj;

import org.academiadecodigo.Rajaj.gameObjects.GameObject;
import org.academiadecodigo.Rajaj.gameObjects.GameObjectFactory;
import org.academiadecodigo.Rajaj.gameObjects.ObjType;
import org.academiadecodigo.Rajaj.grid.Grid;
import org.academiadecodigo.Rajaj.grid.GridFactory;
import org.academiadecodigo.Rajaj.grid.GridImage;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

import java.util.LinkedList;

/**
 * Created by codecadet on 05/02/17.
 */
public class Game implements MouseHandler {

    private Grid grid, grid1;
    private Player player;
    private int objHeight = 8;
    private int objWidth = 17; //16 visible and 1 off canvas;
    private int width;
    private int objPixelSize = 70;
    private int nextObj = 17; // start here and increments everu time
    private int moveCounter;
    private LinkedList<GameObject> list = new LinkedList<>();
    private CollisionDetector collisionDetector;
    private Sound sound, sound1;
    private boolean mousevent;
    private GameObject gameObject , gameObject1;
    private boolean soundOff;



    ObjType[] a = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.FLOOR};
    ObjType[] b = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.TRIANGLE, ObjType.FLOOR};
    ObjType[] c = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SQUARE, ObjType.FLOOR};
    ObjType[] d = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.TRIANGLE, ObjType.SQUARE, ObjType.FLOOR};
    ObjType[] e = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SQUARE, ObjType.SQUARE, ObjType.FLOOR};
    ObjType[] f = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SQUARE, ObjType.BLANK, ObjType.FLOOR};
    ObjType[] g = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SQUARE, ObjType.SQUARE, ObjType.SQUARE, ObjType.FLOOR};
    ObjType[] h = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SQUARE, ObjType.BLANK, ObjType.BLANK, ObjType.FLOOR};
    ObjType[] i = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.TRIANGLE, ObjType.SQUARE, ObjType.SQUARE, ObjType.FLOOR};
    ObjType[] j = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK,
            ObjType.BLANK, ObjType.FINISHLINE, ObjType.FLOOR};
    ObjType[] k = {ObjType.BLANK, ObjType.SPECIALBLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SPECIALBLANK, ObjType.FLOOR};
    ObjType[] l = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.SQUARE, ObjType.SQUARE, ObjType.BLANK, ObjType.FLOOR};
    ObjType[] m = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.TRIANGLE, ObjType.BLANK, ObjType.FLOOR};
    ObjType[] n = {ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.BLANK, ObjType.TRIANGLE, ObjType.BLANK, ObjType.BLANK, ObjType.FLOOR};

    ObjType[][] level1 = {a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, k, a, b, a, a, a, a, a, a, a, a,
            a, a, a, a, a, a, b, b, a, a, a, a, a, a, a, a, a, a, a, a, a, a, c, c, c, c,
            c, c, c, a, a, a, a, a, a, a, a, a, c, c, c, a, a, a, a, a, a, a, a, a, a, c,
            c, c, c, c, c, c, d, a, a, a, a, a, a, a, a, a, a, a, a, a, c, c, c, c, c, c,
            c, e, f, f, f, a, g, g, h, k, a, a, a, a, a, a, a, a, a, a, a, c, c, c, c, c,
            c, d, c, c, c, a, a, a, a, a, a, a, a, a, a, a, a, a, b, b, a, a, a, c, c, c,
            c, c, d, e, e, e, i, h, h, h, h, a, a, a, a, a, a, a, a, a, a, a, a, a, a, b,
            b, a, a, a, a, a, j, a, a, a, a, a, a, a, a, a, a, a, a, a, a};


    Game(int width, int height) {
        grid = GridFactory.makeGrid(width, height);
        grid1 = GridFactory.makeGrid(width, height);
        this.sound = new Sound("/resources/Inicial.wav");
        this.sound1 = new Sound("/resources/xalana.wav");
        this.width=width;

        Mouse m =new Mouse(this);
        m.addEventListener(MouseEventType.MOUSE_CLICKED);

    }

    public void init() {

        grid.init(GridImage.BACKGROUND);

        while (!mousevent) {

            grid1.init(GridImage.MENU);
            sound.play();
           if(soundOff)
           {
               sound.close();
           }
        }
        sound.close();
        grid.init(GridImage.BACKGROUND);
        firstObjects();
        this.sound = new Sound("/resources/indiana.wav");
        mousevent=false;
        grid1.delete();
        sound.play();

        this.player = new Player(grid.makeGridPosition(150, -80, ObjType.PLAYER));
        this.collisionDetector = new CollisionDetector(list, player);


    }


    public Grid getGrid() {
        return grid;
    }


    public void start() {


        while (true) {


            if (collisionDetector.isCrashed()) {
                list.clear();
                nextObj=17;
                grid.delete();
                //gameObject.getGridPosition().hide();
                while(!mousevent)
                {
                    grid1.init(GridImage.GAMEOVER);
                }
                init();

            }
            if (collisionDetector.isXalanaMode()) {
                sound.stop();
                sound.close();
                grid.init(GridImage.SPECIALBACKGROUND);
                player.getGridPosition().hide();
                //player = new Player(grid.makeGridPosition(150, -80, ObjType.SOFIA))
                player.getGridPosition().show();
                sound1.play();

            }


            if (moveCounter % 7 == 0) {
                nextObject();

            }


            for (GameObject g : list) {
                g.move();
                moveCounter++;

            }

            player.move();

            if(!collisionDetector.isOnTheFloor()) {
                player.gravity();
            }


          try {
                Thread.sleep(15);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }

        }

    }


    public void firstObjects() {
        int col = 10;
        for (int o = 0; o < objHeight; o++) {
            int row = 10;
            for (int p = 0; p < objWidth; p++) {
                if (level1[o][p] != ObjType.BLANK) {
                    list.add(GameObjectFactory.getNewGameObject(grid, row, col, level1[p][o]));
                }
                row += objPixelSize;
            }
            col += objPixelSize;
        }
        gameObject1 = GameObjectFactory.getNewGameObject(grid, width, 10, ObjType.WALL);
        gameObject = GameObjectFactory.getNewGameObject(grid, 0, 10, ObjType.WALL);
    }

    public void nextObject() {
        gameObject = GameObjectFactory.getNewGameObject(grid, 0, 10, ObjType.WALL);
        int row = 10;
        for (int i = 0; i < objHeight; i++) {
            row += objPixelSize;
            list.add(GameObjectFactory.getNewGameObject(grid, width, row-70, level1[nextObj][i]));
            list.removeFirst().getGridPosition().hide();
            gameObject1 = GameObjectFactory.getNewGameObject(grid, width, 10, ObjType.WALL);
           }
        nextObj++;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getY() > 250 && mouseEvent.getX() > 400 && mouseEvent.getX() < 720) {
            mousevent = true;
        }

        if(mouseEvent.getY() > 420 && mouseEvent.getX() > 720){
            soundOff=true;
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
