package org.academiadecodigo.Rajaj.game;

import org.academiadecodigo.Rajaj.game.player.Player;
import org.academiadecodigo.Rajaj.grid.Grid;

/**
 * Created by codecadet on 03/02/17.
 */
public class Game {
    private Player player;
    private Grid grid;

    public void init(Player player) {
        this.grid = new Grid();
        this.player = new Player();

        grid.init();

    }

    public void start(){

    }
}
