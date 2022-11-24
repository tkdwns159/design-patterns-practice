package abstractfactorymethod.gundam.body;

public class FreedomGundamFactory implements GundamFactory {

    @Override
    public Gundam createGundam(String unitNumber) {
        return new FreedomGundam(unitNumber);
    }
}
