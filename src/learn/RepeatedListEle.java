package learn;

import java.util.*;

public class RepeatedListEle {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,1,4,5,2);
        Set<Integer> h = new HashSet<>();
        l.stream().filter(i -> !h.add(i)).forEach(System.out::println);

        String brackets = "{()()[]}";
        if (verify(brackets)) System.out.println("balanced");
        else System.out.println("Not balanced");
    }

    public static boolean verify(String str) {
        Deque<Character> set=new ArrayDeque<>();
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch==('(')|| ch==('{')||ch==('[')) {
                set.push(ch);
                continue;
            }
            if (set.isEmpty())
                return false;
            char check;
            switch (ch) {
                case ')':
                    check = set.pop();
                    if (check==('{') || check==('['))
                        return false;
                    break;
                case ']':
                    check = set.pop();
                    if (check==('(') || check==('{'))
                        return false;
                    break;
                case '}':
                    check = set.pop();
                    if (check==('(') || check==('['))
                        return false;
                    break;
                }

        }
        return set.isEmpty();
    }
}
