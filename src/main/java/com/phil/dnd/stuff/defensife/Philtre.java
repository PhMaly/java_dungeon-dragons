package com.phil.dnd.stuff.defensife;

import com.phil.dnd.characters.Character;
import com.phil.dnd.characters.Wizard;

public class Philtre extends DefensiveStuff {

    public Philtre(Integer position) {
        super("\uD83E\uDD4B", "Armor++", 5, position);
    }

    //Constructeur que j'utilise pour équiper un autre Flash par défaut à mon Wizard.
    public Philtre(String typeDefense, String nameDefense, int defensePower) {
        super(typeDefense, nameDefense, defensePower, null);
    }

    @Override
    public void interactWithHeroes(Character hero) {
        if (hero instanceof Wizard) {
            hero.setDefensiveStuff(this);
        }
    }

    @Override
    public void displayCellType() {
        System.out.print("[" + getTypeDefense() + "]");
    }
}
