package board;

import stuff.*;

import java.util.ArrayList;
import java.util.List;

public class Board {

    //    private int[] sizeBoard;
    private List<Cell> cellBoard;

    public Board(int sizeBoard) {
//        this.sizeBoard = new int[sizeBoard];
        this.cellBoard = new ArrayList<>();
        this.cellBoard.add(new EmptyCell(0));
        this.cellBoard.add(new EmptyCell(1));
        this.cellBoard.add(new GoblinCell(2));
        this.cellBoard.add(new Shield(3));
        this.cellBoard.add(new LittlePotion(4));
        this.cellBoard.add(new Flash(5));
        this.cellBoard.add(new Club(6));
        this.cellBoard.add(new Philtre(7));
        this.cellBoard.add(new OrcCell(8));
        this.cellBoard.add(new Sword(9));
        this.cellBoard.add(new BigPotion(10));
        this.cellBoard.add(new FireBall(11));
        this.cellBoard.add(new DragonCell(12));

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
