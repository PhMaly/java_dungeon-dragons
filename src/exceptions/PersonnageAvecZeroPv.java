package exceptions;

import characters.Character;


public class PersonnageAvecZeroPv extends Exception{
    public PersonnageAvecZeroPv(Character hero) {
        System.out.println(hero.getName() + "have no PV !");
    }
}
