package factorymethod;

public class PsychoGundamFactory implements GundamFactory {
    @Override
    public Gundam createGundam(String unitNumber) {
        return new PsychoGundam(unitNumber);
    }
}
