package board;

import characters.Character;

public class EmptyCell implements Cell {


    private String rest;
    private Integer positionOnBoard;


    public EmptyCell(Integer positionOnBoard) {
        this.rest = "Get a rest";
        this.positionOnBoard = positionOnBoard;
    }

    @Override
    public void interactWithHeroes(Character hero) {

    }

    @Override
    public String toString() {
        return "EmptyCell{" +
                "rest='" + rest + '\'' +
                ", positionOnBoard=" + positionOnBoard +
                '}';
    }
}
