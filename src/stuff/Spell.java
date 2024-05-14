package stuff;

import characters.Character;
import characters.Warrior;
import characters.Wizard;

public class Spell extends OffensiveStuff{

    public Spell(String weapon, String name, int attackLevel) {
        super(weapon, name, attackLevel);
    }

    @Override
    public void interactWithHeroes(Character hero) {
        if (hero instanceof Wizard) {
            hero.setOffensiveStuff(this);
        }
    }
}
