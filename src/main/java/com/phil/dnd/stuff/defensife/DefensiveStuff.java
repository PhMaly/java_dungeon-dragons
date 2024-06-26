package com.phil.dnd.stuff.defensife;

import com.phil.dnd.board.listOfCells.Cell;

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
        return "Defensive Loot [" +
                "Defense type = " + typeDefense +
                ", Defense name = " + nameDefense +
                ", \uD83D\uDEE1\uFE0F = " + defensePower +
                ", \uD83D\uDCCD = " + positionOnBoard +
                ']'+ '\n';
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
