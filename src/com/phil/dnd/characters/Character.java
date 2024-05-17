package com.phil.dnd.characters;

import com.phil.dnd.stuff.defensife.DefensiveStuff;
import com.phil.dnd.stuff.offensif.OffensiveStuff;

abstract public class Character {

    private String job;
    private String name;
    private int PV;
    private int strengthPoint;
    private OffensiveStuff offensiveStuff;
    private DefensiveStuff defensiveStuff;
    private int position;

    private Character() {
        this.name = "No name";
        this.job = "No job";
        this.offensiveStuff = null;
        this.defensiveStuff = null;
        this.position = 0;
    }

    private Character(String name) {
        this();
        this.name = name;
    }

    public Character(String name, String type) {
        this(name);
        this.job = type;
    }


    public int getHeroAttack() {
        return this.strengthPoint + offensiveStuff.getAttackPower();
    }

    public int getHeroDefense() {
        return defensiveStuff.getDefensePower();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getStrengthPoint() {
        return strengthPoint;
    }

    public void setStrengthPoint(int strengthPoint) {
        this.strengthPoint = strengthPoint;
    }

    public OffensiveStuff getOffensiveStuff() {
        return offensiveStuff;
    }

    public void setOffensiveStuff(OffensiveStuff offensiveStuff) {
        this.offensiveStuff = offensiveStuff;
    }

    public DefensiveStuff getDefensiveStuff() {
        return defensiveStuff;
    }

    public void setDefensiveStuff(DefensiveStuff defensiveStuff) {
        this.defensiveStuff = defensiveStuff;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "\n Your Stats :" + '\n' +
                " Job = " + job + '\n' +
                " Name = " + name + '\n' +
                " ❤\uFE0F = " + PV + '\n' +
                " \uD83D\uDCAA\uD83C\uDFFB = " + strengthPoint + '\n' +
                " ⚔\uFE0F = " + offensiveStuff + '\n' +
                " \uD83D\uDEE1\uFE0F = " + defensiveStuff;
    }
}
