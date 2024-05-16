package com.phil.dnd.characters;

import com.phil.dnd.stuff.defensife.Philtre;
import com.phil.dnd.stuff.offensif.Flash;

public class Wizard extends Character {


    public Wizard(String name) {
        super(name, "Wizard");

        this.setPV(3);
        this.setStrengthPoint(8);
        this.setOffensiveStuff(new Flash("Flash", "Spark", 1));
        this.setDefensiveStuff(new Philtre("Philtre","Bad Philter",1));
    }

}