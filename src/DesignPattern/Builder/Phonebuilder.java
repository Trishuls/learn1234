package DesignPattern.Builder;

public class Phonebuilder {
    private String brand;
    private int ram;
    private String processor;

    public Phonebuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Phonebuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Phonebuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Phone getPhone() {
        return new Phone(brand,ram,processor);
    }


}
