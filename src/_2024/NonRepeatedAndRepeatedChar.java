package _2024;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedAndRepeatedChar {
    public static void main(String[] args) {
        String str = "helloworld";
        StringBuilder unique = new StringBuilder();
        StringBuilder repeated = new StringBuilder();
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) Character.toLowerCase(c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        str.chars().forEach(k -> {
            if (map.get((char)k)==1) {
                unique.append((char)k);
            }
            else repeated.append((char)k);
        });
        System.out.println(unique.append(repeated));
    }
}
