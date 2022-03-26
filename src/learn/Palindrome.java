package learn;

public class Palindrome {

	public static void main(String[] args) {

		int n = 121;
		int sum = n;
		int temp = 0;
		int r;
		while(n>0)
		{
			r = n%10;
			n = n/10;
			temp = (temp*10)+r;
			
		}
		
		if(temp == sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
