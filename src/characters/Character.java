package characters;

import stuff.DefensiveStuff;
import stuff.OffensiveStuff;

public class Character {

    private String job;
    private String name;
    private int PV;
    private int strengthPoint;
    private OffensiveStuff offensiveStuff;
    private DefensiveStuff defensiveStuff;

    private Character() {
        this.name = "No name";
        this.job = "No job";
        this.offensiveStuff = null;
        this.defensiveStuff = null;
    }

    private Character(String name) {
        this();
        this.name = name;
    }

    public Character(String name, String type) {
        this(name);
        this.job = type;
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

    @Override
    public String toString() {
        return "Character{" +
                "job='" + job + '\'' +
                ", name='" + name + '\'' +
                ", PV=" + PV +
                ", strengthPoint=" + strengthPoint +
                ", offensiveStuff=" + offensiveStuff +
                ", defensiveStuff=" + defensiveStuff +
                '}';
    }
}
