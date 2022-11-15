package singleton;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreadSafeSingletonV2Test {

    @Test
    void always_return_same_instance_with_multiple_threads() {

        class ThreadSafeSingletonV2Maker implements Runnable {

            ThreadSafeSingletonV2 instance;

            @Override
            public void run() {
                this.instance = ThreadSafeSingletonV2.getInstance();
            }
        }

        int numOfThreads = 500;
        List<ThreadSafeSingletonV2Maker> makers = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();

        for(int i = 0; i < numOfThreads; i++) {
            makers.add(new ThreadSafeSingletonV2Maker());
            threads.add(new Thread(makers.get(i)));
        }

        for(Thread thread : threads) {
            thread.run();
        }

        ThreadSafeSingletonV2 represent = makers.get(0).instance;

        for (ThreadSafeSingletonV2Maker maker : makers) {
            assertSame(represent, maker.instance);
        }
    }



    @Test
    void Serialization_doesnt_break_singleton() throws IOException, ClassNotFoundException {
        ThreadSafeSingletonV2 instance = ThreadSafeSingletonV2.getInstance();
        String path = "src/test/java/singleton/ThreadSafeSingletonV2";

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
        outputStream.writeObject(instance);
        outputStream.flush();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
        ThreadSafeSingletonV2 readInstance = (ThreadSafeSingletonV2) inputStream.readObject();

        assertSame(instance, readInstance);
    }

}