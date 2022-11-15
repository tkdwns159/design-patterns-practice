package singleton;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ThreadSafeSingletonV1 implements Serializable {

    private static ThreadSafeSingletonV1 instance = new ThreadSafeSingletonV1();

    private ThreadSafeSingletonV1() {}

    public static ThreadSafeSingletonV1 getInstance() {
        return instance;
    }

}
