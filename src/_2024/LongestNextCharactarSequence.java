package _2024;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LongestNextCharactarSequence {
    public static void main(String[] args) {
        String str = "ahgavabcdxyzabcdefg";
//        int length = 0;
//        List<String> stringList = new ArrayList<>();
//        for (int i=0;i<str.length();i++) {
//            StringBuilder sb = new StringBuilder();
//            char ab = str.charAt(i);
//            sb.append(str.charAt(i));
//            for (int j=i+1;j<str.length();j++) {
//                if (ab+1!=str.charAt(j)) {
//                    break;
//                }
//                ab = str.charAt(j);
//                sb.append(str.charAt(j));
//            }
//            stringList.add(sb.toString());
//        }
//        String[] strarr = new String[1];
//        for (String res: stringList) {
//            if (res.length()>length) {
//                length = res.length();
//                strarr[0]=res;
//            }
//
//        }
//        System.out.println(strarr[0]+" -> "+length);

//        List<String> strlen = new ArrayList<>();
//        for (int i=0;i<str.length();i++) {
//            StringBuilder sb = new StringBuilder();
//            char a = str.charAt(i);
//            sb.append(a);
//            for (int j=i+1;j<str.length();j++) {
//                if ((a+1) != str.charAt(j)) {
//                    break;
//                }
//                sb.append(str.charAt(j));
//                a=str.charAt(j);
//            }
//            strlen.add(sb.toString());
//        }
//        System.out.println(strlen);
//        strlen.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1).forEach(System.out::println);
        //optimized loop
        StringBuilder builder = new StringBuilder();
        StringBuilder max = new StringBuilder();
        for (int i=0;i<str.length();i++) {
            if (i>0 && str.charAt(i)==str.charAt(i-1)+1) {
                builder.append(str.charAt(i));
            } else {
                builder.setLength(0);
                builder.append(str.charAt(i));
            }
            if (builder.length()>max.length()) {
                max.setLength(0);
                max.append(builder);
            }
        }
        System.out.println(max);
    }
}
