package DesignPattern;

public class SynchronizedSingleton implements Cloneable{
    //multi threading
    private volatile static SynchronizedSingleton instance;
    private SynchronizedSingleton(){
        //reflection
        if(instance!=null) {
            throw new RuntimeException("Single tone violation");
        }
    }

    public static SynchronizedSingleton getInstance() {
        if (instance==null){
            synchronized (SynchronizedSingleton.class) {
                if (instance==null) {
                    instance = new SynchronizedSingleton();
                }
            }
        }
        return instance;
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Forbidden cloning singleton class");
    }

    public static void main(String[] args) {
        SynchronizedSingleton.getInstance();
    }
}
