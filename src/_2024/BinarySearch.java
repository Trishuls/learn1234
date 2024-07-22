package _2024;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int target = 6;
        int left = 0;
        int right = array.length-1;
        while (left<=right) {
            int mid = left+(right-left)/2;
            if (array[mid]==target) {
                System.out.println(mid);
            }
            if (array[mid]<target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
    }
}
