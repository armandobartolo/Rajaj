package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by ricardo on 08-02-2017.
 */
public class SpecialBlank extends GameObject implements Hittable{


    public SpecialBlank(GridPosition pos){
        super(pos, ObjType.BLANK);
    }
}
