package com.phil.dnd.exceptions;

import com.phil.dnd.characters.Character;


public class CharacterWithoutPVException extends Exception{
    public CharacterWithoutPVException(Character hero) {
        System.out.println("\n\n"+ hero.getName() + " You are ⚰\uFE0F !");
    }
}
