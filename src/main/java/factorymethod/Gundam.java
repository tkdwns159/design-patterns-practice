package factorymethod;

public class Gundam {

    private String unitNumber;
    private int HP;
    private int strength;

    public String getUnitNumber() {
        return this.unitNumber;
    }

    public int getHP() {
        return this.HP;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }
}
