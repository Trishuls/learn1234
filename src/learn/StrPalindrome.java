package learn;

import java.util.stream.IntStream;

public class StrPalindrome {

	static boolean isPalindrome(String str) {
		
		int i=0;
		int j=str.length()-1;
		
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String args[])
	{
		String str = "qwwq";
        if (IntStream.rangeClosed(0, str.length() / 2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1))) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }

        if(isPalindrome(str))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
	}
}
