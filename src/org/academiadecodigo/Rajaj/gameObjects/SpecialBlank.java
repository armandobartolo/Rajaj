package org.academiadecodigo.Rajaj.gameObjects;

import org.academiadecodigo.Rajaj.grid.position.GridPosition;

/**
 * Created by ricardo on 08-02-2017.
 */
public class SpecialBlank extends GameObject implements Hittable{


    public SpecialBlank(GridPosition pos){
        super(pos, ObjType.BLANK);
    }

<<<<<<< HEAD
    public boolean isHittable(){
        return true;
=======
    @Override
    public boolean isHittable() {
        return false;
>>>>>>> cb0975dd1add05fa6668884ef3264e729732d162
    }
}
