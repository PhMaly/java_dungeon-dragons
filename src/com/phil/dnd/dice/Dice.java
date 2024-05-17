package com.phil.dnd.dice;

import java.util.Random;

public class Dice {

    private int numberFace;

    public Dice() {

    }

    public void throwDiceResult(){
        Random randomDice = new Random();
        numberFace = randomDice.nextInt(6) + 1;

    }

    public int getNumberFace() {
        return numberFace;
    }

    public void setNumberFace(int numberFace) {
        this.numberFace = numberFace;
    }

    @Override
    public String toString() {
        return "dice.Dice{" +
                "\uD83C\uDFB2" + numberFace +
                '}';
    }
}
