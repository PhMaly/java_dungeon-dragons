package characters;

import characters.Character;
import stuff.DefensiveStuff;
import stuff.OffensiveStuff;

public class Warrior extends Character {




    public Warrior(String name) {
        super(name, "Warrior");

        this.setPV(10);
        this.setStrengthPoint(10);
        this.setOffensiveStuff(new OffensiveStuff("Arme","Gourdin",5));
        this.setDefensiveStuff(new DefensiveStuff("Bouclier","Targe en Bois", 5));
    }


}
