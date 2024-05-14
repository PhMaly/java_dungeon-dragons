package exceptions;

import characters.Character;


public class CharacterWithoutPVException extends Exception{
    public CharacterWithoutPVException(Character hero) {
        System.out.println(hero.getName() + "have no PV !");
    }
}
