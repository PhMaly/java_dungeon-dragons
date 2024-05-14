package stuff.defensife;

import board.listOfCells.Cell;

abstract public class DefensiveStuff implements Cell {

    private String typeDefense;
    private String nameDefense;
    private int defensePower;
    private Integer positionOnBoard;



    public DefensiveStuff(String typeDefense, String nameDefense, int defensePower, Integer positionOnBoard) {
        this.typeDefense = typeDefense;
        this.nameDefense = nameDefense;
        this.defensePower = defensePower;
        this.positionOnBoard = positionOnBoard;
    }

    @Override
    public String toString() {
        return "DefensiveStuff{" +
                "typeDefense='" + typeDefense + '\'' +
                ", nameDefense='" + nameDefense + '\'' +
                ", defensePower=" + defensePower +
                ", positionOnBoard=" + positionOnBoard +
                '}';
    }

    public String getTypeDefense() {
        return typeDefense;
    }

    public void setTypeDefense(String typeDefense) {
        this.typeDefense = typeDefense;
    }

    public String getNameDefense() {
        return nameDefense;
    }

    public void setNameDefense(String nameDefense) {
        this.nameDefense = nameDefense;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public int getPositionOnBoard() {
        return positionOnBoard;
    }

    public void setPositionOnBoard(Integer positionOnBoard) {
        this.positionOnBoard = positionOnBoard;
    }
}
