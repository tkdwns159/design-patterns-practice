package abstractfactorymethod.gundam.body;

public class JakuGundamFactory implements GundamFactory {

    @Override
    public Gundam createGundam(String unitNumber) {
        return new JakuGundam(unitNumber);
    }
}
