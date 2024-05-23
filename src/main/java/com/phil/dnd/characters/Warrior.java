package com.phil.dnd.characters;

import com.phil.dnd.stuff.defensife.Shield;
import com.phil.dnd.stuff.offensif.Sword;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, "\uD83E\uDD77\uD83C\uDFFB");

        this.setPV(5);
        this.setStrengthPoint(5);
        this.setOffensiveStuff(null);
        this.setDefensiveStuff(null);
//        this.setOffensiveStuff(new Sword("Sword","Stick",1));
//        this.setDefensiveStuff(new Shield("Shield","Wood Shield",1));
    }

}
