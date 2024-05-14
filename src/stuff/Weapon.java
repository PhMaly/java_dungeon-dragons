package stuff;

import characters.Character;
import characters.Warrior;

public class Weapon extends OffensiveStuff {

    public Weapon(String weapon, String name, int attackLevel) {
        super(weapon, name, attackLevel);
    }

    @Override
    public void interactWithHeroes(Character hero) {
        if (hero instanceof Warrior) {
            hero.setOffensiveStuff(this);
        }
    }
}
