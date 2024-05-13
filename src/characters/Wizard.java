package characters;

import stuff.DefensiveStuff;
import stuff.OffensiveStuff;
import characters.Character;
import stuff.Philtre;
import stuff.Spell;

public class Wizard extends Character {


    public Wizard(String name) {
        super(name, "Wizard");

        this.setPV(6);
        this.setStrengthPoint(15);
        this.setOffensiveStuff(new Spell("Sort","Etincelle",5));
        this.setDefensiveStuff(new Philtre("Philtre","Philtre de defense mineure", 5));
    }

}