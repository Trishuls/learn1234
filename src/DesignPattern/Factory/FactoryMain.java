package DesignPattern.Factory;

public class FactoryMain {
    public static void main(String args[]) {
        OS res = new FactoryImpl().getInstance("IOS");
        res.spec();
    }
}
