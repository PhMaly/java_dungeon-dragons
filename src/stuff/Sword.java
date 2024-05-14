package stuff;

public class Sword extends Weapon{

    public Sword(Integer position) {
        super("Sword", "Anduril", 5, position);
    }

    //Constructeur que j'utilise pour équiper une autre Sword par défaut à mon Warrior.
    public Sword(String weapon, String name, int attackLevel) {
        super(weapon, name, attackLevel, null);
    }
}
