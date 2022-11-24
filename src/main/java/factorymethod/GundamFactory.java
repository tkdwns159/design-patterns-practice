package factorymethod;

public interface GundamFactory {


    default Gundam produce(String unitNumber) {
        validate(unitNumber);

        return createGundam(unitNumber);
    }

    private void validate(String unitNumber) {
        if(unitNumber.isBlank()) {
            throw new IllegalArgumentException("Please provide unitNumber");
        }
    }

     Gundam createGundam(String unitNumber);

}
