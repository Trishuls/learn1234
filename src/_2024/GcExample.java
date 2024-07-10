package _2024;

public class GcExample {
    public static void main(String[] args) {
        GcExample s1=new GcExample();
        GcExample s2=new GcExample();
            s1=null;
            s2=null;
            System.gc();
        }
}
