package _2024;

public class Person implements Cloneable {

    public String name;
    public Integer age;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", address=" + address + '}';
    }

    public Address address;

    Person(String name, Integer age, Address address) {
        this.name=name;
        this.age=age;
        this.address=address;
    }
//    //shallow copy
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    //deep copy
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) this.address.clone();
        return cloned;
    }
}
