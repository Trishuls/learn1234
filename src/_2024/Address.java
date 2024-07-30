package _2024;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface bookData {
    String book();
    int noBook();

}
@bookData(book = "book", noBook = 10)
public class Address implements Cloneable{
    public Address(String area, String country) {
        this.area = area;
        this.country = country;
    }

    public String area;
    public String country;

    protected Object clone() {
        return new Address(this.area,this.country);
    }
}
