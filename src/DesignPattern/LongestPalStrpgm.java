package DesignPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LongestPalStrpgm {
    public static void main(String[] args) {
        String str = "aabbddccbbaakkdddkkaabbccdd";

        List<String> list = palindrome(str);
        int len = 0;
        Collections.sort(list,Collections.reverseOrder());
        String[] strArr = new String[1];
        for (String res:list) {
            if (res.length()>len){
                len = res.length();
                strArr[0]=res;
            }
        }
        System.out.println(strArr[0]);
    }
    public static List<String> palindrome(String str){
        List<String> list = new ArrayList<>();

        for (int a=0; a< str.length();a++){
            for (int b=str.length()-1;b>0;b--){
                int c = b+1;
                if (str.charAt(a)==str.charAt(b)){
                    String s = str.substring(a,c);
                    if(checkPal(s)){
                        list.add(s);
                    }
                    break;
                }
            }
        }
        return list;
    }
    private static boolean checkPal(String str) {
        int i = 0;
        int j = str.length()-1;
        for (int a = 0; a < str.length(); a++){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
