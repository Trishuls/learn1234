package _2024;

import java.util.ArrayList;
import java.util.List;

public class LongestAscDescConseIntArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,12,3,7,6,5,4,22,54,67,87,88,96};
//        List<Integer> acclist = new ArrayList<>();
//        List<Integer> desclist = new ArrayList<>();

        System.out.println(Math.max(ascendingConsecutive(arr), descConsecutive(arr)));
    }

    private static int descConsecutive(int[] arr) {
        int max = 1;
        int curMax = 1;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i+1]<arr[i]) {
                ++curMax;
            } else {
                max = Math.max(max,curMax);
                curMax=0;
            }
        }
        return max;
    }

    private static int ascendingConsecutive(int[] arr) {
        int max = 1;
        int curMax = 1;
        for (int i=0;i<arr.length-1;i++) {

            if (arr[i+1]>arr[i]){
                ++curMax;
            }
            else {
                max = Math.max(max,curMax);
                curMax=0;
            }
        }
        return max;
    }
}
