package board;

import characters.Character;


public class PotionCell implements Cell {

    private String lootType;
    private int lifePower;

    public PotionCell(String lootType, int lifePower) {
        this.lootType = lootType;
        this.lifePower = lifePower;
    }

    @Override
    public void interactWithHeroes(Character hero) {
        hero.setPV(hero.getPV() + lifePower);
    }

    @Override
    public String toString() {
        return "LootCell{" +
                "lootType='" + lootType + '\'' +
                ", lifePower=" + lifePower +
                '}';
    }
}
