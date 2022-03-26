package learn;

class Parent{
    String name;

    void method(){
        System.out.println("parent method");
    }
}
class Child extends Parent{
    int id;


    void method(){
        System.out.println("child method");
    }
}
public class Casting {
    public static void main(String[] args) {
        //upcasting
        Parent p = new Child();
        p.name="Trishul";
        System.out.println(p.name);

        Child c = (Child) p;
        c.id=1;
        c.name="Hanuman";
        System.out.println(c.id+" "+c.name);
        c.method();
    }
}
