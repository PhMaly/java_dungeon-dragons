package com.phil.dnd.stuff.offensif;

import com.phil.dnd.characters.Character;
import com.phil.dnd.characters.Wizard;

abstract public class Spell extends OffensiveStuff{

    public Spell(String weapon, String name, int attackLevel, Integer position) {
        super(weapon, name, attackLevel, position);
    }

    @Override
    public void interactWithHeroes(Character hero) {
        if (hero instanceof Wizard) {
            hero.setOffensiveStuff(this);
        }
    }
}
