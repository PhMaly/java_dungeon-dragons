import characters.Character;
import characters.Warrior;
import characters.Wizard;

import java.util.Scanner;

public class Menu {

    private int classChoice;
    private String nameChoice;
    private int inputDice;

    public Menu() {

    }

    public Character displaySelectCharacter() {

        Character hero = null;

        while (true) {

            String createCharacter = "1.Create Charactere";
            String editCharacter = "2.Edit Charactere";
            String startGame = "3.Start Game";

            System.out.println(createCharacter);
            System.out.println(editCharacter);
            System.out.println(startGame);

            Scanner input = new Scanner(System.in);
            System.out.println("New Charactere, Edit Charactere or Start Game ?");


            int choice = input.nextInt();
            if (choice == 1) {
                Scanner inputJobChoice = new Scanner(System.in);
                System.out.println("Choose your class :");
                System.out.println("1.Warrior");
                System.out.println("2.Wizard");

                this.classChoice = inputJobChoice.nextInt();
                System.out.println("You chose : " + classChoice);

                Scanner inputNameChoice = new Scanner(System.in);
                System.out.println("Choose a name : ");

                this.nameChoice = inputNameChoice.nextLine();
                System.out.println("His name: " + this.nameChoice);

                switch (classChoice) {
                    case 1:
                        hero = new Warrior(this.nameChoice);
                        break;

                    case 2:
                        hero = new Wizard(this.nameChoice);
                        break;
                }

            } else if (choice == 2) {
                System.out.println(hero);

            } else if (choice == 3) {
                if (hero == null) {
                    System.out.println("Vous n'avez pas choisi de héro");
                } else {
                    System.out.println("Vous allez jouer avec " + hero.getName() + " !");
                    return hero;
                }
            } else {
                System.out.println("Make a Choice: 1 , 2 or 3");
            }

        }
    }

    public void displayThrowDice() {
        String dice = "1.Throw Dice";
        System.out.println(dice);
        Scanner input = new Scanner(System.in);
        this.inputDice = input.nextInt();
    }

    public int getInputDice() {
        return inputDice;
    }

    public void setInputDice(int inputDice) {
        this.inputDice = inputDice;
    }
}


