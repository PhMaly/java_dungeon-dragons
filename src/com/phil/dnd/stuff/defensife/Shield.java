package com.phil.dnd.stuff.defensife;

import com.phil.dnd.characters.Character;
import com.phil.dnd.characters.Warrior;

public class Shield extends DefensiveStuff {

    public Shield(Integer position) {
        super("\uD83D\uDD30", "Iron Shield", 5, position);
    }

    //Constructeur que j'utilise pour équiper un autre Shield par défaut à mon Warrior.
    public Shield(String typeDefense, String nameDefense, int defensePower) {
        super(typeDefense, nameDefense, defensePower, null);
    }

    @Override
    public void interactWithHeroes(Character hero) {
        if (hero instanceof Warrior) {
            hero.setDefensiveStuff(this);

        }
    }

    @Override
    public void displayCellType() {
        System.out.print("[" + getTypeDefense() + "]");
    }
}
