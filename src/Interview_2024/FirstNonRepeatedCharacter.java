package Interview_2024;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "aabccdef";
        Character res = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(m -> m.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(res);

        List<Integer> list = Arrays.asList(1,2,4,7,8,55,9);
        System.out.println("second smallest: "+list.stream().sorted().distinct().skip(1).findFirst().get());
        int fl = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for (Integer num:list) {
            if (num>fl) {
                sl = fl;
                fl = num;
            } else if (num>sl && num!=fl) {
                sl=num;
            }
        }
        System.out.println(sl);

//        table emp
//        {
//            column empId;
//            column empName;
//            column sal;
//            column deptId; which references dept table's id column
//        }
//        table dept
//        {
//            column id;
//            column name;
//        }
//        Write the query to return empId, empName and department name, which he/she belongs to.

        //SELECT e.empId, e.empName, d.name FROM emp e, dept d WHERE e.deptId=d.id;
    }
}
