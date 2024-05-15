package com.phil.dnd.stuff.offensif;

import com.phil.dnd.characters.Character;
import com.phil.dnd.characters.Warrior;

abstract public class Weapon extends OffensiveStuff {

    public Weapon(String weapon, String name, int attackLevel, Integer position) {
        //Constructeur de OffensiveStuff.
        super(weapon, name, attackLevel, position);
    }

    @Override
    public void interactWithHeroes(Character hero) {
        if (hero instanceof Warrior) {
            hero.setOffensiveStuff(this);
        }
    }

}
