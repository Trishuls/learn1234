package _2024;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Mysore","India");
        Person obj1 = new Person("Trishul", 25, address);
        System.out.println(obj1.address.area);
        Person obj2 = (Person)obj1.clone();
        obj2.address.area="Mandya";
        System.out.println(obj1.address.area+"-------> "+obj2.address.area);
    }
}
