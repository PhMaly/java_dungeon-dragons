package com.phil.dnd.board.listOfCells;

import com.phil.dnd.characters.Character;
import com.phil.dnd.Menu;
import com.phil.dnd.dice.Dice;
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


    @Override
    public void interactWithHeroes(Character hero) {

        while (isAllAlive(hero)) {
            if (menu.displayContinueFightOrRun(hero)) {
                heroAttackEnemy(hero);
                if (enemyIsDead()) {
                    menu.displayEnemyDead(this);
                } else {
                    enemyAttackHero(hero);
                    menu.displayHeroStat(hero);
                }
            } else {
                break;
            }
        }

    }

    private boolean enemyIsDead() {
        return this.PV <= 0;
    }

    private boolean isAllAlive(Character hero) {
        return this.PV > 0 && hero.getPV() > 0;
    }

    private void heroAttackEnemy(Character hero) {
        this.setPV(this.PV - hero.getHeroAttack());
        menu.displayHeroDamage(hero);
        menu.displayEnemyLife(this);
    }

    private void enemyAttackHero(Character hero) {
        int takingDamage = this.attack - hero.getHeroDefense();
        if (takingDamage < 1) {
            menu.displayEnemyNullDamage(this);
        } else {
            hero.setPV(hero.getPV() - takingDamage);
            menu.displayEnemyDamage(this);
        }
    }

    @Override
    public String toString() {
        return " EnemyCell :" + '\n' +
                " Type = " + type + '\n' +
                " ❤\uFE0F = " + PV + '\n' +
                " ⚔\uFE0F = " + attack + '\n' +
                " \uD83D\uDCCD = " + positionOnBoard + '\n';
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

