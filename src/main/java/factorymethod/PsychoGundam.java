package factorymethod;

public class PsychoGundam extends Gundam {
    PsychoGundam(String unitNumber) {
        setHP(100);
        setStrength(300);
        setUnitNumber(unitNumber);
    }
}
