package com.phil.dnd.board.listOfCells;

import com.phil.dnd.characters.Character;

import java.awt.*;


public class PotionCell implements Cell {

    private String potionType;
    private int lifePower;
    private int positionOnBoard;


    public PotionCell(String type, int lifePower, int positionOnBoard) {
        this.potionType = type;
        this.lifePower = lifePower;
        this.positionOnBoard = positionOnBoard;
    }

    @Override
    public void interactWithHeroes(Character hero) {
        hero.setPV(hero.getPV() + lifePower);
    }

    @Override
    public void displayCellType() {
        System.out.print("[" + potionType + "]");
    }

    @Override
    public String toString() {
        return "Potion Loot [" +
                "Potion type = " + potionType +
                ", + ❤\uFE0F = " + lifePower +
                ", \uD83D\uDCCD = " + positionOnBoard +
                ']'+ '\n';
    }

    public String getPotionType() {
        return potionType;
    }

    public void setPotionType(String potionType) {
        this.potionType = potionType;
    }
}
