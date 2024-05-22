package com.phil.dnd.stuff.offensif;

public class FireBall extends Spell{

    public FireBall(Integer position) {
        super("\uD83D\uDD25", "BOOM", 7, position);
    }

    @Override
    public void displayCellType() {
        System.out.print("[" + getTypeWeapon() + "]");

    }
}
