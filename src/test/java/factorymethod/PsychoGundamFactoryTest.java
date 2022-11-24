package factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PsychoGundamFactoryTest {

    @Test
    void two_different_psycho_gundams_generated() {
        GundamFactory factory = new PsychoGundamFactory();
        Gundam psycho1 = factory.produce("PSYCHO-1");
        Gundam psycho2 = factory.produce("PSYCHO-2");

        Assertions.assertNotSame(psycho1, psycho2);
    }

    @Test
    void throw_IllegalArgumentException_when_unitNumber_is_blank() {
        GundamFactory factory = new PsychoGundamFactory();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            factory.produce(" ");
        });
    }

}