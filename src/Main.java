import characters.Character;
import characters.Warrior;
import characters.Wizard;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Character hero = menu.selectCharacter();

        System.out.println("Vous allez jouer avec " + hero.getName() + " !");


    }
}