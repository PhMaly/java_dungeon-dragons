package board;

import characters.Character;

public class EnemyCell implements Cell {

    private String type;
    private int PV;
    private int attack;

    public EnemyCell(String type, int PV, int attack) {
        this.type = type;
        this.PV = PV;
        this.attack = attack;
    }

    @Override
    public void interactWithHeroes(Character hero) {
    
    }
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "EnemyCell{" +
                "type='" + type + '\'' +
                ", PV=" + PV +
                ", attack=" + attack +
                '}';
    }
}
