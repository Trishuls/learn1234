package _2024;

import java.util.stream.IntStream;

public class StrPalJava8 {
    public static void main(String[] args) {
        String str = "ROTATOR";
        boolean val = IntStream.rangeClosed(0, str.length() / 2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
    }
}
