package abstractfactorymethod.gundam.parts;

public class WhiteSideGundamPartsFactory  implements GundamPartsFactory {
    @Override
    public Sword createSword() {
        return new BeamShabel();
    }

    @Override
    public Gun createGun() {
        return new LazerGun();
    }
}
