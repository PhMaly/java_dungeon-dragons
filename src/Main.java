import characters.Character;
import characters.Warrior;
import characters.Wizard;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior("Frank");
        System.out.println(warrior);

        Character wizard = new Wizard("Tony");
        System.out.println(wizard);


    }
}