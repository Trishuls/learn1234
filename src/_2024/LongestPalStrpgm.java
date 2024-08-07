package _2024;

import java.util.*;
import java.util.stream.IntStream;

public class LongestPalStrpgm {
    public static void main(String[] args) {
        String str = "aabbddccbbaakkdddkkaabbccdd";
        List<String> list = palindrome(str);
        String res = list.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(res);
    }
    public static List<String> palindrome(String str){
        List<String> list = new ArrayList<>();
        for (int a=0;a<str.length();a++) {
            for (int b=str.length()-1;b>0;b--) {
                if (str.charAt(a)==str.charAt(b)) {
                    String subStr = str.substring(a,b+1);
                    if (checkPal(subStr))
                        list.add(subStr);
                    break;
                }
            }
        }
        return list;
    }
    private static boolean checkPal(String str) {
        IntStream.rangeClosed(0,str.length()/2).noneMatch(i-> str.charAt(i)!=str.charAt(str.length()-i-1));
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
