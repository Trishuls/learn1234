package _2024;

public class KadensAlgorithm {
    public static void main(String[] args) {
        System.out.println(maxSubArraySum(new int[]{2, 3, -8, 7, -1, 2, 3}));
    }
    static int maxSubArraySum(int[] a) {
        int res = a[0];
        int max = a[0];

        for (int i=1;i<a.length;i++) {
            max = Math.max(max+a[i],a[i]);
            res = Math.max(max,res);
        }
        return res;
    }
}
