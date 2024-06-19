package learn;

import java.util.*;

public class BalancedBracket {
    public static boolean verify(String str) {
        Deque<Character> set=new ArrayDeque<>();
//        for (int i=0;i<str.length();i++) {
//            char ch = str.charAt(i);
//            if (ch==('(')|| ch==('{')||ch==('[')) {
//                set.push(ch);
//                continue;
//            }
//            if (set.isEmpty())
//                return false;
//            char check;
//            switch (ch) {
//                case ')' -> {
//                    check = set.pop();
//                    if (check == ('{') || check == ('[')) return false;
//                }
//                case ']' -> {
//                    check = set.pop();
//                    if (check == ('(') || check == ('{')) return false;
//                }
//                case '}' -> {
//                    check = set.pop();
//                    if (check == ('(') || check == ('[')) return false;
//                }
//            }
//
//        }
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch=='('||ch=='['||ch=='{') {
                set.push(ch);
                continue;
            }
            if (set.isEmpty())
                return false;
            char chr;
            switch (ch) {
                case ')' -> {
                    chr = set.pop();
                    if (chr=='[' || chr=='{')
                        return false;
                }
                case ']' -> {
                    chr = set.pop();
                    if (chr=='('||chr=='{')
                        return false;
                }
                case '}' -> {
                    chr = set.pop();
                    if (chr=='('||chr=='[')
                        return false;
                }
            }

        }
        return set.isEmpty();
    }

    public static void main(String[] args) {
        String brackets = "{({()()[]})}";
        if (verify(brackets)) System.out.println("balanced");
        else System.out.println("Not balanced");


    }
}
