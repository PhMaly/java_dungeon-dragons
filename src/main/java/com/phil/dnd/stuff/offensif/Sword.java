package com.phil.dnd.stuff.offensif;

public class Sword extends Weapon{

    public Sword(Integer position) {
        super("\uD83D\uDDE1\uFE0F", "Anduril", 5, position);
    }

    //Constructeur que j'utilise pour équiper une autre Sword par défaut à mon Warrior.
    public Sword(String weapon, String name, int attackLevel) {
        super(weapon, name, attackLevel, null);
    }

    @Override
    public void displayCellType() {
        System.out.print("[" + getTypeWeapon() + "]");
    }
}
