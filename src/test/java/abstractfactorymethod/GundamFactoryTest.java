package abstractfactorymethod;

import abstractfactorymethod.gundam.body.FreedomGundamFactory;
import abstractfactorymethod.gundam.body.Gundam;
import abstractfactorymethod.gundam.body.GundamFactory;
import abstractfactorymethod.gundam.body.JakuGundamFactory;
import abstractfactorymethod.gundam.parts.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GundamFactoryTest {

    @Test
    void produce_Freedom_Gundam() {
        GundamFactory factory = new FreedomGundamFactory();

        String unitNumber = "Freedom-1";
        Gundam gundam = factory.produce(unitNumber, new WhiteSideGundamPartsFactory());

        assertEquals(gundam.getUnitNumber(), unitNumber);
        assertEquals(gundam.getSword().getClass(), BeamShabel.class);
        assertEquals(gundam.getGun().getClass(), LazerGun.class);
    }

    @Test
    void produce_Jaku_Gundam() {
        GundamFactory factory = new JakuGundamFactory();

        String unitNumber = "Jaku-1";
        Gundam gundam = factory.produce(unitNumber, new BlackSideGundamPartsFactory());

        assertEquals(gundam.getUnitNumber(), unitNumber);
        assertEquals(gundam.getSword().getClass(), ShortKnife.class);
        assertEquals(gundam.getGun().getClass(), MachineGun.class);
    }


}