package stuff.offensif;

import board.listOfCells.Cell;

abstract public class OffensiveStuff implements Cell {

    private String typeWeapon;
    private String nameWeapon;
    private int attackPower;
    private Integer positionOnBoard;

    public OffensiveStuff(String weapon, String name, int attackLevel, Integer positionOnBoard) {
        this.typeWeapon = weapon;
        this.nameWeapon = name;
        this.attackPower = attackLevel;
        this.positionOnBoard = positionOnBoard;
    }

    @Override
    public String toString() {
        return "OffensiveStuff{" +
                "typeWeapon='" + typeWeapon + '\'' +
                ", nameWeapon='" + nameWeapon + '\'' +
                ", attackPower=" + attackPower +
                ", position=" + positionOnBoard +
                '}';
    }

    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getPositionOnBoard() {
        return positionOnBoard;
    }

    public void setPositionOnBoard(Integer positionOnBoard) {
        this.positionOnBoard = positionOnBoard;
    }
}
