import Board.Board;
import characters.Character;
import exceptions.PersonnageAvecZeroPv;
import exceptions.PersonnageHorsPlateauException;

import java.util.Arrays;

public class Game {

    private Menu menu;
    private Board board;
    private Character hero;
    private Dice throwDice;
    private int heroPosition;
    //private List<Cell> cellList;

    public Game() {
        this.menu = new Menu();
        this.board = new Board(64);
        this.throwDice = new Dice();

    }

    public void initGame() {
        this.hero = menu.displaySelectCharacter();

    }

    public void playGame() {
        //afficher le board
        System.out.println(Arrays.toString(board.getSizeBoard()));


        //le perso et ses stats
        System.out.println(this.hero);

        //Tant que je peux jouer (hero > 0pV et jai pas depassé le board)
        while (this.hero.getPV() > 0 && this.hero.getPosition() <= 64) {
            try {
                gameTurn();
            } catch (PersonnageHorsPlateauException error) {
                System.out.println("You Win !");
            } catch (PersonnageAvecZeroPv error) {
                System.out.println("You Lost !");
            }
        }

    }
    public void gameTurn() throws PersonnageHorsPlateauException, PersonnageAvecZeroPv {
        //afficher la case
        System.out.println("You are here : " + this.hero.getPosition()+ "/64");
        //lance le dés
        menu.displayThrowDice();
        int diceResult = 0;
        if (menu.getInputDice() == 1) {
                throwDice.throwDice();
                diceResult = throwDice.getNumberFace();
                System.out.println("You do " + diceResult);
                //javance sur la nouvelle case
                this.hero.setPosition(this.hero.getPosition() + diceResult);
            } else {
                System.out.println("Throw Dice please");
            }
        if (this.hero.getPosition() > 64) {
            throw new PersonnageHorsPlateauException();
        } else if (this.hero.getPV() <= 0) {
            throw new PersonnageAvecZeroPv(hero);
        }
    }
    }

