package com.phil.dnd.board.listOfCells;

public class DragonCell extends EnemyCell {

    public DragonCell(Integer position) {
        //Constructeur de EnemyCell
        super("\uD83D\uDC09", 20, 8, position);

    }

    @Override
    public void displayCellType() {
        System.out.print("[" + getType() + "]");
    }
}
