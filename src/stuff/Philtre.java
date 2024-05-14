package stuff;

import characters.Character;
import characters.Warrior;
import characters.Wizard;

public class Philtre extends DefensiveStuff{

    public Philtre(Integer position) {
        super("Philtre", "Armor++", 5, position);
    }

    //Constructeur que j'utilise pour équiper un autre Flash par défaut à mon Wizard.
    public Philtre(String typeDefense, String nameDefense, int defensePower) {
        super(typeDefense, nameDefense, defensePower, null);
    }

    @Override
    public void interactWithHeroes(Character hero) {
        if (hero instanceof Wizard) {
            hero.setDefensiveStuff(this);
        }
    }
}
