@FunctionalInterface
interface AddFunc {
    int add(int a, int b);
}

public class FunctionalAdd {
    public static void main(String[] args) {
//        AddFunc obj = (a,b) -> a+b;
        AddFunc obj = Integer::sum;
        System.out.println(obj.add(5,6));
    }
}
