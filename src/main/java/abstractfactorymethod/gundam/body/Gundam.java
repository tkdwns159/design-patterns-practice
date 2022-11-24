package abstractfactorymethod.gundam.body;

import abstractfactorymethod.gundam.parts.Gun;
import abstractfactorymethod.gundam.parts.Sword;

public class Gundam {
    private String unitNumber;
    private int HP;
    private int strength;

    private Sword sword;
    private Gun gun;

    public String getUnitNumber() {
        return unitNumber;
    }

    public Gun getGun() {
        return gun;
    }

    public Sword getSword() {
        return sword;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }
}
