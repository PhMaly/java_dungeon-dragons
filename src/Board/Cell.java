package Board;

import characters.Character;

import java.util.List;

abstract public class Cell {

    private List<Cell> cellList;

    public Cell(List<Cell> cellList) {

        this.cellList = List.of();

    }
}
