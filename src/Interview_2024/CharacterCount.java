package Interview_2024;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "aabbccccdgfffdgqwerty";
        str.chars()
                .mapToObj(c -> (char)Character.toLowerCase(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(value -> value.getValue()>1)
                .forEach(System.out::println);
    }
}
