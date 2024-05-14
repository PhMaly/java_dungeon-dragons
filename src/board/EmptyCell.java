package board;

import characters.Character;

public class EmptyCell implements Cell {


    private String rest;

    public EmptyCell() {
        this.rest = "Get a rest";
    }

    @Override
    public void interactWithHeroes(Character hero) {

    }

    @Override
    public String toString() {
        return "EmptyCell{" +
                "rest='" + rest + '\'' +
                '}';
    }
}
