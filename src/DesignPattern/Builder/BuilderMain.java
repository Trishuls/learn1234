package DesignPattern.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        Phone obj = new Phonebuilder().setBrand("samsng").setRam(2).getPhone();
        System.out.println(obj);
    }
}
