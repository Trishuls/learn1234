package _2024;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumOfPairsFromGivenKey {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,4,7,8,6,3,2);
        int key = 9;
        Map<Integer, Long> res = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(Map.Entry m : res.entrySet()) {
            int pair = key-(int)m.getKey();
            if (res.containsKey(pair))
                System.out.println(m.getKey()+","+pair);
        }
    }
}
