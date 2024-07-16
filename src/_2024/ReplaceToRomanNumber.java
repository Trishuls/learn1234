package _2024;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class ReplaceToRomanNumber {
    private static final TreeMap<Integer,String> romanMap = new TreeMap<>();
    static {
        romanMap.put(1,"I");
        romanMap.put(4,"IV");
        romanMap.put(5,"V");
        romanMap.put(9,"IX");
        romanMap.put(10,"X");
    }
    private static String convertToRoman(int num) {
        int floorKey = romanMap.floorKey(num);
        if (floorKey==num) {
            return romanMap.get(num);
        }
        return romanMap.get(floorKey)+convertToRoman(num-floorKey);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(21,11,15,2);
        numbers.stream().map(ReplaceToRomanNumber::convertToRoman).forEach(System.out::println);
    }
}
