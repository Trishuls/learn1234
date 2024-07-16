package _2024;

public class NumPal {
    static boolean checkPal(int num) {
        int r,temp=0;
        int sum = num;
        while (num > 0) {
            r = num%10;
            num = num/10;
            temp = temp*10+r;
        }
        return temp==sum;
    }
    public static void main(String[] args) {
        System.out.println(checkPal(121));
    }
}
