package characters;

import stuff.DefensiveStuff;
import stuff.OffensiveStuff;
import characters.Character;

public class Wizard extends Character {


    public Wizard(String name) {
        super(name, "Wizard");

        this.setPV(6);
        this.setStrengthPoint(15);
    }

}