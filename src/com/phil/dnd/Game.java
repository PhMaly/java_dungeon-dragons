package com.phil.dnd;

import com.phil.dnd.board.Board;
import com.phil.dnd.characters.Character;
import com.phil.dnd.dice.Dice;
import com.phil.dnd.exceptions.CharacterWithoutPVException;
import com.phil.dnd.exceptions.CharacterOutOfBoardException;
import com.phil.dnd.board.listOfCells.Cell;

public class Game {

    private Menu menu;
    private Board board;
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
        //menu.displayBoard(board, hero);


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

        menu.displayYouAreHere(hero);
        menu.displayBoard(board, hero);

        //lance le dés
        menu.displayThrowDice();

        int diceResult = 0;
        if (menu.getInputDice() == 1) {
            throwDice.throwDiceResult();
            diceResult = throwDice.getNumberFace();
            System.out.println("You do " + diceResult + " \uD83C\uDFB2" + "\n");

            //javance sur la nouvelle case
            this.hero.setPosition(this.hero.getPosition() + diceResult);

            if (this.hero.getPosition() > board.size()) {
                throw new CharacterOutOfBoardException();
            }
            Cell cell = this.board.getCellHero(this.hero.getPosition());
            menu.displayYouAreHere(hero);


            menu.displayCell(cell);
            menu.displayHeroStat(hero);
            cell.interactWithHeroes(this.hero);
            menu.displayBoard(board, hero);

            if (this.hero.getPV() <= 0) {
                throw new CharacterWithoutPVException(hero);
            }

            //Je peux afficher les stats de mon hero
            menu.displayHeroStat(hero);

        } else {
            System.out.println("Throw dice please");
        }
    }
}

