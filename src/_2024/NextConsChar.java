package _2024;

public class NextConsChar {
    public static void main(String[] args) {
        String seq = "abcdefzZ";
        StringBuilder str = new StringBuilder();
        for (char ch:seq.toCharArray()) {
            if (Character.isDigit(ch))
                str.append(ch);
            else {
                if (ch=='Z')
                    str.append('A');
                else if (ch=='z') {
                    str.append('a');
                }
                else
                    str.append((char) (ch +1));
            }
        }
        System.out.println(str);
    }
}
