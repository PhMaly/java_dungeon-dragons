package board;

import characters.Character;


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
    public String toString() {
        return "PotionCell{" +
                "potionType='" + potionType + '\'' +
                ", lifePower=" + lifePower +
                ", positionOnBoard=" + positionOnBoard +
                '}';
    }
}
