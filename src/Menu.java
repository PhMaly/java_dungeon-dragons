import characters.Character;
import characters.Warrior;

import java.util.Scanner;

public class Menu {

    private String classChoice;
    private String nameChoice;

    public Menu() {

        String createCharactere = "1.Create Charactere";
        String exitGame = "2.Exit Game";

        System.out.println(createCharactere);
        System.out.println(exitGame);

        Scanner input = new Scanner(System.in);
        System.out.println("New Charactere or Exit ?");

        int choice = input.nextInt();
        if (choice == 1) {
            Scanner newCharactere = new Scanner(System.in);
            System.out.println("Choose your class : Warrior or Wizard ?");

            this.classChoice = newCharactere.nextLine();
            System.out.println("You chose : " + classChoice);

            Scanner charactereName = new Scanner(System.in);
            System.out.println("Choose a name : ");

            this.nameChoice = charactereName.nextLine();
            System.out.println("His name: " + this.nameChoice);

//            Character newCharacter = new Character(this.classChoice, this.nameChoice);
//            System.out.println(newCharacter);

        } else if (choice == 2) {
            System.out.println("Exit Game");
        }
//        System.out.println(classChoice);
//        System.out.println(nameChoice);

    }

    public String getClassChoice() {
        return classChoice;
    }

    public void setClassChoice(String classChoice) {
        this.classChoice = classChoice;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "classChoice='" + classChoice + '\'' +
                ", nameChoice='" + nameChoice + '\'' +
                '}';
    }
}
