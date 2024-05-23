package com.phil.dnd.board.listOfCells;

import com.phil.dnd.characters.Character;

public class EmptyCell implements Cell {


    private String rest;
    private Integer positionOnBoard;


    public EmptyCell(Integer positionOnBoard) {
        this.rest = "Get a rest !";
        this.positionOnBoard = positionOnBoard;
    }

    @Override
    public void interactWithHeroes(Character hero) {

    }

    @Override
    public void displayCellType() {
        System.out.print("[ ]");
    }

    @Override
    public String toString() {
        return "Empty Cell :" +
                rest +
                " \uD83D\uDCCD = " + positionOnBoard+ '\n';
    }
}
