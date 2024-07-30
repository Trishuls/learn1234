package Interview_2024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LargestInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,54,1,2,6,10);
        list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(System.out::println);
        list.stream().sorted(Comparator.naturalOrder()).limit(2).skip(1).forEach(System.out::println);

        String str = "absgsfshaklskkkkk";

        Map<Character, Long> map = str.chars().mapToObj(c -> (char) Character.toLowerCase(c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
        System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get());
    }
}
