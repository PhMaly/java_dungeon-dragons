package com.phil.dnd.board;

import com.phil.dnd.board.listOfCells.*;
import com.phil.dnd.stuff.defensife.Philtre;
import com.phil.dnd.stuff.defensife.Shield;
import com.phil.dnd.stuff.offensif.Club;
import com.phil.dnd.stuff.offensif.FireBall;
import com.phil.dnd.stuff.offensif.Flash;
import com.phil.dnd.stuff.offensif.Sword;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {


    private List<Cell> cellBoard;

    public Board() {

        this.cellBoard = new ArrayList<>();
        this.cellBoard.add(new EmptyCell(0));
        this.cellBoard.add(new Flash(1));
        this.cellBoard.add(new Club(2));
        this.cellBoard.add(new GoblinCell(3));
        this.cellBoard.add(new Flash(4));
        this.cellBoard.add(new Club(5));
        this.cellBoard.add(new GoblinCell(6));
        this.cellBoard.add(new LittlePotion(7));
        this.cellBoard.add(new Flash(8));
        this.cellBoard.add(new GoblinCell(9));
        this.cellBoard.add(new OrcCell(10));
        this.cellBoard.add(new Club(11));
        this.cellBoard.add(new GoblinCell(12));
        this.cellBoard.add(new LittlePotion(13));
        this.cellBoard.add(new Philtre(14));
        this.cellBoard.add(new GoblinCell(15));
        this.cellBoard.add(new Shield(16));
        this.cellBoard.add(new Flash(17));
        this.cellBoard.add(new GoblinCell(18));
        this.cellBoard.add(new Sword(19));
        this.cellBoard.add(new OrcCell(20));
        this.cellBoard.add(new GoblinCell(21));
        this.cellBoard.add(new Club(22));
        this.cellBoard.add(new Flash(23));
        this.cellBoard.add(new GoblinCell(24));
        this.cellBoard.add(new OrcCell(25));
        this.cellBoard.add(new Sword(26));
        this.cellBoard.add(new GoblinCell(27));
        this.cellBoard.add(new BigPotion(28));
        this.cellBoard.add(new Philtre(29));
        this.cellBoard.add(new GoblinCell(30));
        this.cellBoard.add(new LittlePotion(31));
        this.cellBoard.add(new OrcCell(32));
        this.cellBoard.add(new LittlePotion(33));
        this.cellBoard.add(new Shield(34));
        this.cellBoard.add(new OrcCell(35));
        this.cellBoard.add(new OrcCell(36));
        this.cellBoard.add(new OrcCell(37));
        this.cellBoard.add(new Club(38));
        this.cellBoard.add(new LittlePotion(39));
        this.cellBoard.add(new OrcCell(40));
        this.cellBoard.add(new BigPotion(41));
        this.cellBoard.add(new Sword(42));
        this.cellBoard.add(new LittlePotion(43));
        this.cellBoard.add(new OrcCell(44));
        this.cellBoard.add(new DragonCell(45));
        this.cellBoard.add(new EmptyCell(46));
        this.cellBoard.add(new OrcCell(47));
        this.cellBoard.add(new FireBall(48));
        this.cellBoard.add(new FireBall(49));
        this.cellBoard.add(new EmptyCell(50));
        this.cellBoard.add(new Shield(51));
        this.cellBoard.add(new DragonCell(52));
        this.cellBoard.add(new Sword(53));
        this.cellBoard.add(new EmptyCell(54));
        this.cellBoard.add(new EmptyCell(55));
        this.cellBoard.add(new DragonCell(56));
        this.cellBoard.add(new EmptyCell(57));
        this.cellBoard.add(new EmptyCell(58));
        this.cellBoard.add(new EmptyCell(59));
        this.cellBoard.add(new EmptyCell(60));
        this.cellBoard.add(new GoblinCell(61));
        this.cellBoard.add(new DragonCell(62));
        this.cellBoard.add(new EmptyCell(63));

        Collections.shuffle(cellBoard);
    }

    public Cell getCellHero(int position) {
        return cellBoard.get(position);
    }

    public int size() {
        return cellBoard.size();
    }

    @Override
    public String toString() {
        return "Board{" +
                "cellBoard=" + cellBoard +
                '}';
    }

    public List<Cell> getCellBoard() {
        return cellBoard;
    }

    public void setCellBoard(List<Cell> cellBoard) {
        this.cellBoard = cellBoard;
    }
}
