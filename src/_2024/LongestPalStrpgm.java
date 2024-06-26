package _2024;

import java.util.*;

public class LongestPalStrpgm {
    public static void main(String[] args) {
        String str = "aabbddccbbaakkdddkkaabbccdd";

        List<String> list = palindrome(str);
        String res = list.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
        System.out.println(res);
//        int len = 0;
//        Collections.sort(list,Collections.reverseOrder());
//        String[] strArr = new String[1];
//        for (String res:list) {
//            if (res.length()>len){
//                len = res.length();
//                strArr[0]=res;
//            }
//        }
//        System.out.println(strArr[0]);
    }
    public static List<String> palindrome(String str){
        List<String> list = new ArrayList<>();
        for (int a=0;a<str.length();a++) {
            for (int b=str.length()-1;b>0;b--) {
                int c = b+1;
                if (str.charAt(a)==str.charAt(b)) {
                    String subStr = str.substring(a,c);
                    if (checkPal(subStr))
                        list.add(subStr);
                    break;
                }
            }
        }
//        for (int a=0; a< str.length();a++){
//            for (int b=str.length()-1;b>0;b--){
//                int c = b+1;
//                if (str.charAt(a)==str.charAt(b)){
//                    String s = str.substring(a,c);
//                    if(checkPal(s)){
//                        list.add(s);
//                    }
//                    break;
//                }
//            }
//        }

//        for (int i=0;i<str.length();i++){
//            for (int j=str.length()-1;j>0; j--) {
//                int c = j+1;
//                if (str.charAt(i)!=str.charAt(j))
//                    break;
//                else {
//                    String substr = str.substring(i,c);
//                    if (checkPal(substr))
//                        list.add(substr);
//                }
//            }
//        }
        return list;
    }
    private static boolean checkPal(String str) {
//        int i = 0;
//        int j = str.length()-1;
//        for (int a = 0; a < str.length(); a++){
//            if (str.charAt(i) != str.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
        int i = 0;
        int j = str.length()-1;
        for (int a=0;a<str.length();a++) {
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
