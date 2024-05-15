package com.phil.dnd;

import com.phil.dnd.board.Board;
import com.phil.dnd.characters.Character;
import com.phil.dnd.dice.Dice;
import com.phil.dnd.exceptions.CharacterWithoutPVException;
import com.phil.dnd.exceptions.CharacterOutOfBoardException;
import com.phil.dnd.board.listOfCells.Cell;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Menu menu;
    private Board board;
//    private List<Cell> cellList;
    private Character hero;
    private Dice throwDice;

    public Game() {
        this.menu = new Menu();
        this.board = new Board();
        this.throwDice = new Dice();

    }

    public void initGame() {
        this.hero = menu.displaySelectCharacter();

    }

    public void playGame() {
        //afficher le board
        System.out.println(board.toString());


        //le perso et ses stats
        System.out.println(this.hero);

        //Tant que je peux jouer (hero > 0pV et jai pas depassé le board)
        while (this.hero.getPV() > 0 && this.hero.getPosition() <= board.size()) {
            try {
                gameTurn();
            } catch (CharacterOutOfBoardException error) {
                menu.displayHeroWin();
            } catch (CharacterWithoutPVException error) {
                menu.displayHeroLost();
            }
        }

    }

    public void gameTurn() throws CharacterOutOfBoardException, CharacterWithoutPVException {
        //afficher la case
        System.out.println("You are here : " + this.hero.getPosition() + "/64");
        //lance le dés
        menu.displayThrowDice();
        int diceResult = 0;
        if (menu.getInputDice() == 1) {
            throwDice.throwDice();
            diceResult = throwDice.getNumberFace();
            System.out.println("You do " + diceResult);

            //javance sur la nouvelle case
            this.hero.setPosition(this.hero.getPosition() + diceResult);
            Cell cell = this.board.getCell(this.hero.getPosition());
            menu.displayCell(cell);
            cell.interactWithHeroes(this.hero);

            //Je peux afficher les stats de mon hero
            menu.displayHeroStat();

        } else {
            System.out.println("Throw dice please");
        }
        if (this.hero.getPosition() > board.size()) {
            throw new CharacterOutOfBoardException();
        } else if (this.hero.getPV() <= 0) {
            throw new CharacterWithoutPVException(hero);
        }
    }
}

