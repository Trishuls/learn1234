package learn;

public class SpecialNumber {
	public static void main(String args[]) {
		for(int n=1;n<1000;n++)
		{
			if((n/10)+(n%10)+(n/10)*(n%10) == n)
			{
				System.out.println(n);
			}
		}
	}
}
