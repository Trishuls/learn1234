package _2024;

class Parent {
    public void show() {
        System.out.println("Parent show");
    }
}
class Child extends Parent {
//    @Override
    public void show() {
        System.out.println("Child show");
    }
    public void run() {
        System.out.println("Run");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        Parent p;
        p = new Child();
//        Child c = new Child();
        p.show();
//        c.run();
    }
}
