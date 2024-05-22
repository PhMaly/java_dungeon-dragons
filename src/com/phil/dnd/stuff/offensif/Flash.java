package com.phil.dnd.stuff.offensif;

public class Flash extends Spell{

    public Flash(Integer position) {
        super("⚡", "1000Volt", 2, position);
    }

    //Constructeur que j'utilise pour équiper un autre Flash par défaut à mon Wizard.
    public Flash(String weapon, String name, int attackLevel) {
        super(weapon, name, attackLevel, null);
    }

    @Override
    public void displayCellType() {
        System.out.print("[" + getTypeWeapon() + "]");
    }
}
