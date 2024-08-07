package _2024;

public class AddWithoutUsingOperator {
    public static int addNum(int a, int b) {
        while (b!=0) {
            int carry = a&b;
            a = a^b;
            b = carry<<1;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(addNum(3,2));
    }
}
