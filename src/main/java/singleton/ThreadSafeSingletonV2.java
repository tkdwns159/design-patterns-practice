package singleton;

import java.io.Serializable;

public class ThreadSafeSingletonV2 implements Serializable {

    private static ThreadSafeSingletonV2 instance;

    private ThreadSafeSingletonV2() {
    }

    public static ThreadSafeSingletonV2 getInstance() {
        if(instance == null) {
            synchronized (ThreadSafeSingletonV2.class) {
                if(instance == null) {
                    instance = new ThreadSafeSingletonV2();
                }
            }
        }

        return instance;
    }

    protected Object readResolve() {
        return instance;
    }
}
