package _2024;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] array = {21,15,47,3,52};
        int fl = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for (int num : array) {
            if (num>fl) {
                sl = fl;
                fl = num;
            } else if (num > sl && num !=fl) {
                sl = num;
            }
        }
        System.out.println(sl);
    }
}
