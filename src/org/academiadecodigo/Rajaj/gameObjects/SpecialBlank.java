package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by ricardo on 08-02-2017.
 */
public class SpecialBlank extends GameObject implements Hittable{

    private int size;

    public SpecialBlank(GridPosition pos){
        super(pos, ObjType.SPECIALBLANK);
    }


    public boolean isHittable(){
        return true;
    }

}
