package singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class SimpleSingletonTest {

    @Test
    void always_return_same_instance() {
        SimpleSingleton s1 = SimpleSingleton.getInstance();
        SimpleSingleton s2 = SimpleSingleton.getInstance();

        Assertions.assertSame(s1, s2);
    }

    @Test
    void always_return_same_instance_with_multiple_thread() {

        class SimpleSingletonMaker implements Runnable {

            SimpleSingleton singleton;

            @Override
            public void run() {
                this.singleton = SimpleSingleton.getInstance();
            }
        }

        int numOfThread = 500;
        List<Thread> threadList = new ArrayList<>();
        List<SimpleSingletonMaker> runnableList = new ArrayList<>();

        for(int i =0 ; i < numOfThread; i++) {
            SimpleSingletonMaker singletonMaker = new SimpleSingletonMaker();
            runnableList.add(singletonMaker);
            threadList.add(new Thread(singletonMaker));
        }

        for (Thread thread : threadList) {
            thread.start();
        }

        SimpleSingletonMaker represent = runnableList.get(0);
        for(SimpleSingletonMaker maker: runnableList) {
            Assertions.assertSame(represent.singleton, maker.singleton);
        }
    }


}