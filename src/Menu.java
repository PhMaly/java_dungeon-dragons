import characters.Character;
import characters.Warrior;
import characters.Wizard;

import java.util.Scanner;

public class Menu {

    private String classChoice;
    private String nameChoice;

    public Menu() {

    }

    public Character selectCharacter() {

        Character hero = null;

        while (true) {

            String createCharacter = "1.Create Charactere";
            String editCharacter = "2.Edit Charactere";
            String startGame = "3.GO";

            System.out.println(createCharacter);
            System.out.println(editCharacter);
            System.out.println(startGame);

            Scanner input = new Scanner(System.in);
            System.out.println("New Charactere, Edit Charactere or GO ?");


            int choice = input.nextInt();
            if (choice == 1) {
                Scanner inputJobChoice = new Scanner(System.in);
                System.out.println("Choose your class : Warrior or Wizard ?");

                this.classChoice = inputJobChoice.nextLine();
                System.out.println("You chose : " + classChoice);

                Scanner inputNameChoice = new Scanner(System.in);
                System.out.println("Choose a name : ");

                this.nameChoice = inputNameChoice.nextLine();
                System.out.println("His name: " + this.nameChoice);

                switch (classChoice) {
                    case "Warrior":
                        hero = new Warrior(this.nameChoice);
                        break;

                    case "Wizard":
                        hero = new Wizard(this.nameChoice);
                        break;
                }
                System.out.println(hero);

            } else if (choice == 2) {
                System.out.println("Edit Charactere");

            } else if (choice == 3) {
                if (hero == null) {
                    System.out.println("Vous n'avez pas choisi de héro");
                } else {
                    return hero;
                }
            } else {
                System.out.println("Make a Choice: 1 , 2 or 3");
            }

        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "classChoice='" + classChoice + '\'' +
                ", nameChoice='" + nameChoice + '\'' +
                '}';
    }
}
