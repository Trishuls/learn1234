package _2024;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterSequenceCountCephid {
    public static void main(String[] args) {
        String input = "aaabbbccecccddddfdd"; // Input string
        String output = compressString(input);
        System.out.println(output);
    }

    private static String compressString(String input) {
        StringBuilder result = new StringBuilder();
        int count=1;
        for (int i=0;i<input.length();i++) {
            if (i<input.length()-1&&input.charAt(i)==input.charAt(i+1))
                ++count;
            else  {
                result.append(input.charAt(i)).append(count);
                count=1;
            }
        }
        return result.toString();
    }
}
