package com.phil.dnd.board.listOfCells;

import com.phil.dnd.characters.Character;
import com.phil.dnd.Menu;
import com.phil.dnd.stuff.defensife.DefensiveStuff;
import com.phil.dnd.stuff.offensif.OffensiveStuff;

abstract public class EnemyCell implements Cell {

    private String type;
    private int PV;
    private int attack;
    private int positionOnBoard;
    private Menu menu = new Menu();


    public EnemyCell(String type, int PV, int attack, int position) {
        this.type = type;
        this.PV = PV;
        this.attack = attack;
        this.positionOnBoard = position;
    }

//    public void enemyDamage(Character hero){
//        this.attack - hero.getDefensiveStuff();
//    }

    @Override
    public void interactWithHeroes(Character hero) {

        while (this.PV > 0 && hero.getPV() > 0) {
            this.setPV(this.PV - hero.getHeroAttack());
            menu.displayHeroDamage(hero);
            menu.displayEnemyLife(this);
            if (this.PV > 0) {
                if (hero.getHeroDefense() > this.attack) {
                    menu.displayEnemyNullDamage(this);
                } else {
                    hero.setPV(hero.getHeroDefense() - this.attack);
                    menu.displayEnemyDamage(this);
                }
            }
            if (this.PV <= 0) {
                System.out.println(this.type + " is dead ! ");
                System.out.println("Great ! you are always alive ... for the moment.");
            }
        }

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
