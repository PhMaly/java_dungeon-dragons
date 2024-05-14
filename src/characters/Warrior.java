package characters;

import stuff.defensife.Shield;
import stuff.offensif.Sword;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, "Warrior");

        this.setPV(10);
        this.setStrengthPoint(10);
        this.setOffensiveStuff(new Sword("Sword","Stick",1));
        this.setDefensiveStuff(new Shield("Shield","Wood Shield",1));
    }

}
