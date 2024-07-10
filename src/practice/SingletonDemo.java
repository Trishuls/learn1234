package practice;

public class SingletonDemo {
    private static SingletonDemo instance;

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                instance = new SingletonDemo();
            }
        }
        return instance;
    }
    public static void main (String[]args){
        SingletonDemo.getInstance();
    }
}
