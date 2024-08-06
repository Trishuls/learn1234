package Interview_2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterEY {
    public static void main(String[] args) {
        String str = "cccnnddt";
        String str1 = "cccnnddt";
        Character result = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s->s.getValue()==1)
                .map(a->a.getKey())
                .findFirst()
                .get();
        System.out.println(result);

        List<Integer> list1 = Arrays.asList(1,2,4,3,8,7);
        List<Integer> list2 = Arrays.asList(5,4,3,2,1);
        if (list1.size()!=list2.size())
            System.out.println("List are not equal");
        if (compute(list1).equals(compute(list2)))
            System.out.println("List are Equal");
        else System.out.println("List are not equal");
    }
    public static Map<Integer,Long> compute(List<Integer> list) {
        return list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
