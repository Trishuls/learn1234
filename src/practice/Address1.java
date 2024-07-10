package practice;

public class Address1 implements Cloneable{
    public String area;
    public String country;

    public Address1(String area, String country) {
        this.area = area;
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
