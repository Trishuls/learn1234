package _2024;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int start = 0, end = array.length-1;
        while (start<end) {
            int temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));
        //using java 8
        System.out.print(Arrays.toString(IntStream.rangeClosed(1,array.length).map(i->array[array.length-i]).toArray()));
    }
}
