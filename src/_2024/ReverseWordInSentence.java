package _2024;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordInSentence {
    public static void main(String[] args) {
        String str = "Hello Java developer";
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (char ch: str.toCharArray()) {
            if (ch!=' ') {
                sb.append(ch);
            } else {
                list.add(sb.toString());
                sb.delete(0,sb.length());
            }
        }
        list.add(sb.toString());
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.joining(" ")));

        //Java 8
        System.out.println(Stream.of(str.split(" ")).sorted(Comparator.reverseOrder()).collect(Collectors.joining(" ")));

    }
}
