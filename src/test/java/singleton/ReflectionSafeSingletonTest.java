package singleton;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.io.*;
import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionSafeSingletonTest {

    Logger logger = LoggerFactory.getLogger(ReflectionSafeSingletonTest.class);

    @Test
    void reflection_unable() {
        String errorMessage = assertThrows(IllegalArgumentException.class, () -> {
            Constructor<?>[] constructors = ReflectionSafeSingleton.class.getDeclaredConstructors();
            ReflectionSafeSingleton instance;

            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instance = (ReflectionSafeSingleton) constructor.newInstance("SINGLETON");

                assertSame(instance,  ReflectionSafeSingleton.SINGLETON);
            }

        }).getMessage();

        logger.error(() -> errorMessage);
    }

    @Test
    void Serialization_do_not_break_singleton() throws IOException, ClassNotFoundException {
        String path = "src/test/java/singleton/ReflectionSafeSingleton";

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
        outputStream.writeObject(ReflectionSafeSingleton.SINGLETON);
        outputStream.flush();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
        ReflectionSafeSingleton readInstance =  (ReflectionSafeSingleton) inputStream.readObject();

        assertSame(ReflectionSafeSingleton.SINGLETON, readInstance);
    }

}