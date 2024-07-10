package DesignPattern.Builder;

public class Phone {
    private String brand;
    private int ram;

    @Override
    public String toString() {
        return "BuilderPhone{" + "brand='" + brand + '\'' + ", ram=" + ram + ", processor='" + processor + '\'' + '}';
    }

    public Phone(String brand, int ram, String processor) {
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
    }

    private String processor;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
