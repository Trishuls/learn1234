package DesignPattern;

public class SynchronizedSingleton implements Cloneable{
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

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Forbidden clonning singleton class");
    }

    public static void main(String[] args) {
        SynchronizedSingleton.getInstance();
    }
}
