package _2024;

public class NumPal {
    static boolean checkPalindrome (int num) {
//        if (num<=1)
//            return false;
//        for (int i=2;i<num/2;i++) {
//            if (num%2==0)
//                return false;
//        }
        int r,temp = 0;
        while (num>0) {
            r = num%10;
            num = num/10;
            temp = (temp*10)+r;
        }
        System.out.println(temp);
        return true;
    }

    public static void main(String[] args) {
        if (checkPalindrome(129)) System.out.println("pal");
        else System.out.println("Not pal");
    }
}
