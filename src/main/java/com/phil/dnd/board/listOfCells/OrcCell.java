package com.phil.dnd.board.listOfCells;

public class OrcCell extends EnemyCell {

    public OrcCell(Integer position) {
        //Constructeur de EnemyCell
        super("\uD83E\uDDCC", 10, 4, position);

    }


    @Override
    public void displayCellType() {
        System.out.print("[" + getType() + "]");
    }
}
