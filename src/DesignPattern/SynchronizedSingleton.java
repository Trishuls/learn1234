package DesignPattern;

public class SynchronizedSingleton {
    private volatile static SynchronizedSingleton instance;
    private SynchronizedSingleton(){}

    public static SynchronizedSingleton getInstance() {
        if (instance==null){
            synchronized (SynchronizedSingleton.class) {
                    instance = new SynchronizedSingleton();
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SynchronizedSingleton.getInstance();
    }
}
