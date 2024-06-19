package _2024;

public class NextConsecutiveChar {
    public static void main(String[] args) {
        String sequence ="abcdef";
        System.out.println(changeSequence(sequence));

    }
    public static String changeSequence(String sequence) {
        String res = "";
        for (char val:sequence.toCharArray()) {
            if (Character.isLetter(val)) {
                if (val == 'z')
                    res+='a';
                else if (val == 'Z')
                    res+='A';
                else
                    res+=(char) (val +1);
            } else {
                res+=val;
            }
        }
        return res;
    }
}
