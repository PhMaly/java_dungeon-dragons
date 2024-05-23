package com.phil.dnd.board.listOfCells;

public class GoblinCell extends EnemyCell {

    public GoblinCell(Integer position) {
        //Constructeur de EnemyCell
        super("\uD83E\uDDDF\u200D\uFE0F", 7, 2, position);

    }


    @Override
    public void displayCellType() {
        System.out.print("[" + getType() + "]");
    }
}
