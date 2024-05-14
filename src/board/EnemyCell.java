package board;

import characters.Character;

abstract public class EnemyCell implements Cell {

    private String type;
    private int PV;
    private int attack;
    private int positionOnBoard;

    public EnemyCell(String type, int PV, int attack, int position) {
        this.type = type;
        this.PV = PV;
        this.attack = attack;
        this.positionOnBoard = position;
    }

    @Override
    public void interactWithHeroes(Character hero) {
    
    }


    @Override
    public String toString() {
        return "EnemyCell{" +
                "type='" + type + '\'' +
                ", PV=" + PV +
                ", attack=" + attack +
                ", position=" + positionOnBoard +
                '}';
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

    public int getPositionOnBoard() {
        return positionOnBoard;
    }

    public void setPositionOnBoard(int positionOnBoard) {
        this.positionOnBoard = positionOnBoard;
    }
}
