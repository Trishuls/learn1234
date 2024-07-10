package practice;

public class ShallowDeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address1 address1 = new Address1("Mys","India");
        Person1 person1 = new Person1("Trishul",26,address1);
        System.out.println(person1.name+"--------->"+person1.address1.area);
        Person1 person12 = (Person1)person1.clone();
        person12.address1.area="Mandya";
        System.out.println(person1.address1.area+"==========>"+person12.address1.area);
    }
}
