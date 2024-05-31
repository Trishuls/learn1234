package DesignPattern;

public class SynchronizedSingleton {
    private volatile static SynchronizedSingleton instance;
    private SynchronizedSingleton(){}

    public static SynchronizedSingleton getInstance() {
        if (instance==null){
            synchronized (Singleton.class) {
                if (instance==null)
                    instance = new SynchronizedSingleton();
            }
        }
        return instance;
    }
}
