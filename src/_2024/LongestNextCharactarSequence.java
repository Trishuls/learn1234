package _2024;

import java.util.ArrayList;
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

        int len = 0;
        List<String> strlen = new ArrayList<>();
        for (int i=0;i<str.length();i++) {
            StringBuilder sb = new StringBuilder();
            char a = str.charAt(i);
            sb.append(a);
            for (int j=i+1;j<str.length();j++) {
                if ((a+1) != str.charAt(j)) {
                    break;
                }
                sb.append(str.charAt(j));
                a=str.charAt(j);
            }
            strlen.add(sb.toString());
        }
        System.out.println(strlen);
    }
}
