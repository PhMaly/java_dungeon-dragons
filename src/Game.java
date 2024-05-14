import board.Board;
import characters.Character;
import exceptions.CharacterWithoutPVException;
import exceptions.CharacterOutOfBoardException;
import board.Cell;

public class Game {

    private Menu menu;
    private Board board;
    private Character hero;
    private Dice throwDice;
    private int heroPosition;
    //private List<Cell> cellBoard;

    public Game() {
        this.menu = new Menu();
        this.board = new Board(4);
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
                System.out.println("You Win !");
            } catch (CharacterWithoutPVException error) {
                System.out.println("You Lost !");
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

        } else {
            System.out.println("Throw Dice please");
        }
        if (this.hero.getPosition() > board.size()) {
            throw new CharacterOutOfBoardException();
        } else if (this.hero.getPV() <= 0) {
            throw new CharacterWithoutPVException(hero);
        }
    }
}

