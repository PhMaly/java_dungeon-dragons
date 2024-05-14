package characters;

import stuff.defensife.Philtre;
import stuff.offensif.Flash;

public class Wizard extends Character {


    public Wizard(String name) {
        super(name, "Wizard");

        this.setPV(6);
        this.setStrengthPoint(15);
        this.setOffensiveStuff(new Flash("Flash", "Spark", 1));
        this.setDefensiveStuff(new Philtre("Philtre","Bad Philter",1));
    }

}