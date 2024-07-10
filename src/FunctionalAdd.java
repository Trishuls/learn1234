import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface AddFunc {
    int add(int a, int b);
}

public class FunctionalAdd {
    public static void main(String[] args) {
//        AddFunc obj = (a,b) -> a+b;
        AddFunc obj = Integer::sum;
        System.out.println(obj.add(5,6));
        List<Integer> list = Arrays.asList(1,2,5,4,5);
        System.out.println(list.stream().reduce(Integer::sum).get());
    }
}
