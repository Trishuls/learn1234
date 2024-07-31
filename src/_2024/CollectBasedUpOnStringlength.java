package _2024;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CollectBasedUpOnStringlength {
    public static void main(String[] args) {
        String input = "apple banana cherry date elderberry fig grape pig";
        System.out.println(Arrays.asList(input.split(" ")).stream().collect(Collectors.groupingBy(String::length)));
    }
}
