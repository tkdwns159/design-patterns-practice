package singleton;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreadSafeSingletonV1Test {

    @Test
    void always_return_same_instance() {
        ThreadSafeSingletonV1 s1 = ThreadSafeSingletonV1.getInstance();
        ThreadSafeSingletonV1 s2 = ThreadSafeSingletonV1.getInstance();

        assertSame(s1, s2);
    }

    @Test
    void always_return_same_instance_with_multiple_threads() {

        class ThreadSafeSingletonV1Maker implements Runnable {

            ThreadSafeSingletonV1 instance;

            @Override
            public void run() {
                this.instance = ThreadSafeSingletonV1.getInstance();
            }
        }

        int numOfThreads = 500;
        List<ThreadSafeSingletonV1Maker> makers = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();

        for(int i = 0; i < numOfThreads; i++) {
            makers.add(new ThreadSafeSingletonV1Maker());
            threads.add(new Thread(makers.get(i)));
        }

        for(Thread thread : threads) {
            thread.run();
        }

        ThreadSafeSingletonV1 represent = makers.get(0).instance;

        for (ThreadSafeSingletonV1Maker maker : makers) {
            assertSame(represent, maker.instance);
        }
    }

    @Test
    void reflection_breaks_singleton() throws NoSuchMethodException {
        Constructor<ThreadSafeSingletonV1> constructor = ThreadSafeSingletonV1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            ThreadSafeSingletonV1 s1 = constructor.newInstance();
            ThreadSafeSingletonV1 s2 = constructor.newInstance();

            assertNotSame(s1, s2);
        } catch (InvocationTargetException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void Serialization_breaks_singleton() throws IOException, ClassNotFoundException {
        ThreadSafeSingletonV1 instance = ThreadSafeSingletonV1.getInstance();
        String path = "src/test/java/singleton/ThreadSafeSingletonV1";

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
        outputStream.writeObject(instance);
        outputStream.flush();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
        ThreadSafeSingletonV1 readInstance = (ThreadSafeSingletonV1) inputStream.readObject();

        assertNotSame(instance, readInstance);
    }

}