package DesignPattern;

public class Singleton {
    public static void main(String[] args) {
        Demo obj = Demo.getInstance();
    }
}
class Demo {
    //1.Create a static object of the class
    static Demo obj = new Demo();
    //2. Make default constructor private so that no one can create object
    private Demo(){

    }
    //create method which returns the object of this class
    public static Demo getInstance() {
        return obj;
    }
}
