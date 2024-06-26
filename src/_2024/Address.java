package _2024;

public class Address implements Cloneable{
    public Address(String area, String country) {
        this.area = area;
        this.country = country;
    }

    public String area;
    public String country;

    protected Object clone() throws CloneNotSupportedException {
        return new Address(this.area,this.country);
    }
}
