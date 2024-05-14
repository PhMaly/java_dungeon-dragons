package stuff;

import characters.Character;
import characters.Warrior;
import characters.Wizard;

public class Philtre extends DefensiveStuff{

    public Philtre(String typeDefense, String nameDefense, int defensePower) {
        super(typeDefense, nameDefense, defensePower);
    }

    @Override
    public void interactWithHeroes(Character hero) {
        if (hero instanceof Wizard) {
            hero.setDefensiveStuff(this);
        }
    }
}
