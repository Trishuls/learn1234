package _2024;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListCompWithKey {
    public static void main(String[] args) {
        String key = "hello";
        List<String> list = Arrays.asList("elloh","hello","hellooo","olleh");
        list.stream()
                .filter(
                        s->s.chars().
                                mapToObj(c -> (char) Character.toLowerCase(c))
                                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                .equals(key.chars()
                                        .mapToObj(s1->(char)Character.toLowerCase(s1)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())))).forEach(System.out::println);
    }
}
