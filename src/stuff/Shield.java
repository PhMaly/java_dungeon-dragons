package stuff;

import characters.Character;
import characters.Warrior;

public class Shield extends DefensiveStuff {

    public Shield(String typeDefense, String nameDefense, int defensePower) {
        super(typeDefense, nameDefense, defensePower);
    }

    @Override
    public void interactWithHeroes(Character hero) {
        if (hero instanceof Warrior) {
            hero.setDefensiveStuff(this);
        }
    }
}
