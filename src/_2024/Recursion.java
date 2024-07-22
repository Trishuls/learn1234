package _2024;

public class Recursion {
    static int recur(int num) {
        if (num==1)
            return num;
        return recur(num-1)*num;
    }
    public static void main(String[] args) {
        System.out.println(recur(6));
    }
}
