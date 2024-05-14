package board;

import stuff.Shield;

import java.util.ArrayList;
import java.util.List;

public class Board {

    //    private int[] sizeBoard;
    private List<Cell> cellBoard;

    public Board(int sizeBoard) {
//        this.sizeBoard = new int[sizeBoard];
        this.cellBoard = new ArrayList<>();
        this.cellBoard.add(new EmptyCell());
        this.cellBoard.add(new EmptyCell());
        this.cellBoard.add(new EnemyCell("Orc", 5, 5));
        this.cellBoard.add(new Shield("Bouclier", "Ecu en argent", 5));
        this.cellBoard.add(new PotionCell("Potion", 5));

    }

//
//    public int[] getSizeBoard() {
//        return sizeBoard;
//    }
//
//    public void setSizeBoard(int[] sizeBoard) {
//        this.sizeBoard = sizeBoard;
//    }

    public Cell getCell(int position) {
        return cellBoard.get(position);
    }

    @Override
    public String toString() {
        return "Board{" +
                "size=" + cellBoard.size() +
                '}';
    }

    public int size() {
        return cellBoard.size();
    }
}
