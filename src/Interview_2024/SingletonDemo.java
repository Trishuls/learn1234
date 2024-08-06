package Interview_2024;

public class SingletonDemo implements Cloneable{
    private volatile static SingletonDemo instance;
    private SingletonDemo(){}
    public static SingletonDemo getInstance() {
        if (instance==null) {
            synchronized (SingletonDemo.class) {
                instance = new SingletonDemo();
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone not allowed for singleton class");
    }
}
