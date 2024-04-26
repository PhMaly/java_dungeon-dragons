package characters;

import stuff.DefensiveStuff;
import stuff.OffensiveStuff;

public class Wizard extends Character {

    private String job;
    private String name;
    private int PV;
    private int strengthPoint;
    private OffensiveStuff offensiveStuff;
    private DefensiveStuff defensiveStuff;


    public Wizard() {
        this("Who i am ?");
    }

    public Wizard(String name) {
        this(name, "Wizard");
    }

    public Wizard(String name, String type) {
        this.name = name;
        this.job = type;

        //par default
        this.PV = 6;
        this.strengthPoint = 15;
        this.offensiveStuff = null;
        this.defensiveStuff = null;
    }

}