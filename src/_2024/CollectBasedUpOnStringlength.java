package _2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectBasedUpOnStringlength {
    public static void main(String[] args) {
        String input = "apple banana cherry date elderberry fig grape pig";
        Map<Integer, List<String>> res = Arrays.asList(input.split(" ")).stream().collect(Collectors.groupingBy(String::length));
    }
}
