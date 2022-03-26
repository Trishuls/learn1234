package learn;

public class Factorial {
    public static void main(String[] args) {
        int n = 6;
        long res = factor(n);
        System.out.println(res);
    }

    private static long factor(int n) {
        if (n>=1)
        {
            return n * factor(n - 1);
        }
        else
            return 1;
    }
}
