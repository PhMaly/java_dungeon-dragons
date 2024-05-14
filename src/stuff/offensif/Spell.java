package stuff.offensif;

import characters.Character;
import characters.Wizard;

abstract public class Spell extends OffensiveStuff{

    public Spell(String weapon, String name, int attackLevel, Integer position) {
        super(weapon, name, attackLevel, position);
    }

    @Override
    public void interactWithHeroes(Character hero) {
        if (hero instanceof Wizard) {
            hero.setOffensiveStuff(this);
        }
    }
}
