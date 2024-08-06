package Interview_2024;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        String str = "My name is Prateek what";
        Arrays.asList(str.split(" ")).stream().collect(Collectors.groupingBy(String::length))
                .entrySet().stream().filter(i -> i.getKey()%2==0).forEach(System.out::println);

        //SELECT MIN(SALARY) FROM (SELECT DISTINCT SALARY FROM EMPLOYEE ORDER BY SAlARY DESC) WHERE ROWNUM<3;
    }
}
