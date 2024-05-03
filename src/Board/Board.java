package Board;

import characters.Character;

import java.util.Arrays;

public class Board {

    private int[] sizeBoard;

    public Board(int sizeBoard) {
        this.sizeBoard = new int[sizeBoard];
    }

//    public void getBoard(int heroPosition) {
//        for (int i = 0; i < sizeBoard.length; i++) {
//            if (sizeBoard[i] == heroPosition) {
//                System.out.print("[X]");
//            } else {
//                String format = String.format("[%d]", (i + 1));
//                System.out.print(format);
//            }
//
//            if ((i + 1) % 8 == 0) {
//                System.out.println();
//            }
//        }
//    }


    public int[] getSizeBoard() {
        return sizeBoard;
    }

    public void setSizeBoard(int[] sizeBoard) {
        this.sizeBoard = sizeBoard;
    }

    @Override
    public String toString() {
        return "Board{" +
                "sizeBoard=" + Arrays.toString(sizeBoard) +
                '}';
    }
}
