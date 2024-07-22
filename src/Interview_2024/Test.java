package Interview_2024;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Asha",30);
        hashMap.put("Trishul",25);
        hashMap.put("Ravi",51);
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }

}
