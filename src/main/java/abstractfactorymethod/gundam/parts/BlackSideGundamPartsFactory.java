package abstractfactorymethod.gundam.parts;

public class BlackSideGundamPartsFactory implements GundamPartsFactory {
    @Override
    public Sword createSword() {
        return new ShortKnife();
    }

    @Override
    public Gun createGun() {
        return new MachineGun();
    }
}
