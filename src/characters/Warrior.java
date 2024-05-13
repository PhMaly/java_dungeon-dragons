package characters;

import characters.Character;
import stuff.DefensiveStuff;
import stuff.OffensiveStuff;
import stuff.Shield;
import stuff.Weapon;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, "Warrior");

        this.setPV(10);
        this.setStrengthPoint(10);
        this.setOffensiveStuff(new Weapon("Arme","Gourdin",5));
        this.setDefensiveStuff(new Shield("Bouclier","Targe en Bois", 5));
    }

}
