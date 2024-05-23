package com.phil.dnd;

import com.phil.dnd.board.Board;
import com.phil.dnd.board.listOfCells.Cell;
import com.phil.dnd.board.listOfCells.EnemyCell;
import com.phil.dnd.characters.Character;
import com.phil.dnd.characters.Warrior;
import com.phil.dnd.characters.Wizard;
import com.phil.dnd.database.DatabaseRequest;
import com.phil.dnd.dice.Dice;

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
        DatabaseRequest dbRequest = new DatabaseRequest();

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

                classChoiceInput();

                switch (classChoice) {
                    case 1:
                        nameChoiceInput();
                        hero = new Warrior(this.nameChoice);
                        dbRequest.createHero(hero);
                        break;

                    case 2:
                        nameChoiceInput();
                        hero = new Wizard(this.nameChoice);
                        dbRequest.createHero(hero);
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose 1 or 2.");
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

    private void classChoiceInput() {
        System.out.println("Choose your class :");
        System.out.println("1.Warrior");
        System.out.println("2.Wizard");
        this.classChoice = scanner.nextInt();
        System.out.println("You chose : " + classChoice);
    }

    private void nameChoiceInput() {
        System.out.println("Choose a name : ");
        scanner = new Scanner(System.in);
        this.nameChoice = scanner.nextLine();
        System.out.println("His name: " + this.nameChoice);
    }

    public void displayThrowDice() {
        String dice = "\n \n 1.Throw Dice" + " \uD83C\uDFB2 \n";
        System.out.println(dice);
        this.inputDice = scanner.nextInt();
    }

    public void displayHeroStat(Character hero) {
        String stat = "\n Show your Stats ?" + " \uD83D\uDCCA";
        System.out.println(stat);
        System.out.println("1.Yes");
        System.out.println("2.No");
        this.inputChoice = scanner.nextInt();

        switch (inputChoice) {
            case 1:
                System.out.println("Your Stats : " + hero);
                break;

            case 2:
                System.out.println("We continue !" + "\n");
                break;

            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                break;
        }
    }

    public void displayBoard(Board board, Character hero) {
        for (int i = 0; i < board.size(); i++) {
            Cell cell = board.getCellBoard().get(i);
            if (i == hero.getPosition()) {
                System.out.print("[" + "\uD83D\uDCCD" + "]");
            } else {
                cell.displayCellType();
            }
            if ((i + 1) % 30 == 0) {
                System.out.println();
            }
        }

    }

    public void displayCell(Cell cell) {
        System.out.println("You arrive at : " + cell.toString());
    }

    public void displayYouAreHere(Character hero) {
        System.out.println("You are here : " + hero.getPosition() + "/64" + " \uD83D\uDCCD\uD83D\uDDFA\uFE0F \n");
    }

    public void displayHeroLost() {
        System.out.println("You Lose !" + " \uD83D\uDEAB");
    }

    public void displayHeroWin() {
        System.out.println("You Win !" + " \uD83C\uDFC6");
    }

    public void displayHeroDamage(Character hero) {
        System.out.println("You do " + hero.getHeroAttack() + " damage !" + " \uD83D\uDCA5");
    }

    public void displayEnemyLife(EnemyCell enemyCell) {
        System.out.println(enemyCell.getType() + " has " + enemyCell.getPV() + " life points left.");
    }

    public void displayEnemyDamage(EnemyCell enemyCell) {
        System.out.println(enemyCell.getType() + " make you " + enemyCell.getAttack() + " damage !" + " \uD83D\uDCA5" + "\n");
    }

    public void displayEnemyNullDamage(EnemyCell enemyCell) {
        System.out.println(enemyCell.getType() + " make you 0 \uD83D\uDCA5. So Easy !");
    }

    public void displayEnemyDead(EnemyCell enemyCell) {
        System.out.println(enemyCell.getType() + " is \uD83D\uDC80 !");
        System.out.println("Great ! you are always alive ... for the moment. \n");
    }

    public boolean displayContinueFightOrRun(Character hero) {
        String stat = "Continue the fight or Run ?";
        System.out.println(stat);
        System.out.println("1.Continue");
        System.out.println("2.Run");
        this.inputChoice = scanner.nextInt();

        switch (inputChoice) {
            case 1:
                return true;
            case 2:
                System.out.println("You Run !");
                int diceResult = 0;
                Dice dice = new Dice();
                dice.throwDiceResult();
                diceResult = dice.getNumberFace();
                hero.setPosition(hero.getPosition() - diceResult);
                System.out.println("You move back " + diceResult + " cell !" + "\n");
                if (hero.getPosition() < 0){
                    hero.setPosition(0);
                }
                displayYouAreHere(hero);
                return false;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                return displayContinueFightOrRun(hero);
        }
    }

    public int getInputDice() {
        return inputDice;
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


