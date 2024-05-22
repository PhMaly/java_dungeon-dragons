package com.phil.dnd.board.listOfCells;

import com.phil.dnd.characters.Character;

public interface Cell {

    void interactWithHeroes(Character hero);
    void displayCellType();
}
