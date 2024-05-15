package com.phil.dnd;

import com.phil.dnd.board.listOfCells.Cell;
import com.phil.dnd.board.listOfCells.EnemyCell;
import com.phil.dnd.characters.Character;
import com.phil.dnd.characters.Warrior;
import com.phil.dnd.characters.Wizard;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    private int classChoice;
    private String nameChoice;
    private int inputDice;
    private int inputChoice;
    private Character hero;

    public Menu() {

    }

    public Character displaySelectCharacter() {

        hero = null;

        while (true) {

            String createCharacter = "1.New Character";
            String editCharacter = "2.Edit Character";
            String startGame = "3.Start Game";

            System.out.println(createCharacter);
            System.out.println(editCharacter);
            System.out.println(startGame);


            System.out.println("New Character, Edit Character or Start Game ?");


            int choice = scanner.nextInt();
            if (choice == 1) {

                System.out.println("Choose your class :");
                System.out.println("1.Warrior");
                System.out.println("2.Wizard");
                this.classChoice = scanner.nextInt();
                System.out.println("You chose : " + classChoice);


                System.out.println("Choose a name : ");
                scanner = new Scanner(System.in);
                this.nameChoice = scanner.nextLine();
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
                    System.out.println("You didn't choose a hero. Please choose.");
                } else {
                    System.out.println("You will play with " + hero.getName() + " !");
                    return hero;
                }
            } else {
                System.out.println("Make a Choice: 1 , 2 or 3");
            }

        }
    }

    public void displayThrowDice() {
        String dice = "1.Throw dice.Dice";
        System.out.println(dice);
        this.inputDice = scanner.nextInt();
    }

    public void displayHeroStat() {
        String stat = "Show your Stats ?";
        System.out.println(stat);
        System.out.println("1.Yes");
        System.out.println("2.No");
        this.inputChoice = scanner.nextInt();

        switch (inputChoice) {
            case 1:
                System.out.println("Your Stats : " + hero);
                break;

            case 2:
                System.out.println("We continue !");
                break;
        }
    }

    public int getInputDice() {
        return inputDice;
    }

    public void displayCell(Cell cell) {
        System.out.println(cell.toString());
    }

    public void displayHeroLost() {
        System.out.println("You Lose !");
    }

    public void displayHeroWin() {
        System.out.println("You Win !");
    }

    public void displayHeroDamage(Character hero) {
        System.out.println("You do " + hero.getHeroAttack() + " damage !");
    }

    public void displayEnemyLife(EnemyCell enemyCell) {
        System.out.println(enemyCell.getType() + " has " + enemyCell.getPV() + " life points left.");
    }

    public void displayEnemyDamage(EnemyCell enemyCell) {
        System.out.println(enemyCell.getType() + " make you " + enemyCell.getAttack() + " damage !");
    }

    public void displayEnemyNullDamage(EnemyCell enemyCell) {
        System.out.println(enemyCell.getType() + " make you 0 damage. So Easy !");
    }

    public void setInputDice(int inputDice) {
        this.inputDice = inputDice;
    }

    public int getClassChoice() {
        return classChoice;
    }

    public void setClassChoice(int classChoice) {
        this.classChoice = classChoice;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    public int getInputChoice() {
        return inputChoice;
    }

    public void setInputChoice(int inputChoice) {
        this.inputChoice = inputChoice;
    }
}


