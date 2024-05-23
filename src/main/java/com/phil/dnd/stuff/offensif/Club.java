package com.phil.dnd.stuff.offensif;

public class Club extends Weapon{

    public Club(Integer position) {
        super("\uD83E\uDDAF", "The Big Club", 3, position);
    }

    @Override
    public void displayCellType() {
        System.out.print("[" + getTypeWeapon() + "]");

    }
}
