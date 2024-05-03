package stuff;

abstract public class DefensiveStuff {

    private String typeDefense;
    private String nameDefense;
    private int defensePower;


    public DefensiveStuff(String typeDefense, String nameDefense, int defensePower) {
        this.typeDefense = typeDefense;
        this.nameDefense = nameDefense;
        this.defensePower = defensePower;
    }

    public String getTypeDefense() {
        return typeDefense;
    }

    public void setTypeDefense(String typeDefense) {
        this.typeDefense = typeDefense;
    }

    public String getNameDefense() {
        return nameDefense;
    }

    public void setNameDefense(String nameDefense) {
        this.nameDefense = nameDefense;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    @Override
    public String toString() {
        return "DefensiveStuff{" +
                "typeDefense='" + typeDefense + '\'' +
                ", nameDefense='" + nameDefense + '\'' +
                ", defensePower=" + defensePower +
                '}';
    }
}
