package _2024;

public class Polimorphism {
    Polimorphism(){
//        super();
//        this();
    }
    public void method(Object obj) {
        System.out.println("Object");
    }
    public void method(String str) {
        System.out.println("String");
    }

    public static void main(String[] args) {
        Polimorphism polimorphism = new Polimorphism();
        polimorphism.method(null);
        OverLoading overLoading = new OverLoading();
        overLoading.add(5);
        overLoading.add(1, 2, 3);
    }
    static class OverridingPolymorphism extends Polimorphism{
        OverridingPolymorphism() {
            //super() can be used inside constructor
            //this() cannot be used
            //this keyword can be used
            super();
        }
    }
    static class OverLoading {
        public void add(int a) {
            System.out.println("A");
        }
        public void add(int... a) {
            System.out.println("....A");
        }
    }
}
