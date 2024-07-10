package practice;

public class Person1 implements Cloneable{
    public String name;
    public Integer age;
    public Address1 address1;

    public Person1(String name, Integer age, Address1 address1) {
        this.name = name;
        this.age = age;
        this.address1 = address1;
    }
//    //shallow
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    //deep
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person1 cloned = (Person1)super.clone();
        cloned.address1 = (Address1) cloned.address1.clone();
        return cloned;
    }
}
