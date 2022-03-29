import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatedListEle {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,1,4,5,2);
        Set<Integer> h = new HashSet<>();
        l.stream().filter(i -> !h.add(i)).forEach(System.out::println);
//        System.out.println(res);
    }
}
