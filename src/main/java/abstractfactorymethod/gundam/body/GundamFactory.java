package abstractfactorymethod.gundam.body;

import abstractfactorymethod.gundam.parts.GundamPartsFactory;

public interface GundamFactory {

    default Gundam produce(String unitNumber, GundamPartsFactory partsFactory) {
        validate(unitNumber);

        Gundam gundam = createGundam(unitNumber);
        gundam.setGun(partsFactory.createGun());
        gundam.setSword(partsFactory.createSword());

        return gundam;
    }

    Gundam createGundam(String unitNumber);

    private void validate(String unitNumber) {
        if(unitNumber.isBlank()) {
            throw new IllegalArgumentException("Please provide unitNumber");
        }
    }

}
