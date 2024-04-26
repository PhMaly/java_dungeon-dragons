package stuff;

public class OffensiveStuff {

    private String typeWeapon;
    private String nameWeapon;
    private int attackPower;

    public OffensiveStuff(String weapon, String name, int attackLevel) {
        this.typeWeapon = weapon;
        this.nameWeapon = name;
        this.attackPower = attackLevel;
    }

    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

}
