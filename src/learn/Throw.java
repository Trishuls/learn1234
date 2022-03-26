package learn;

import java.util.Scanner;

public class Throw {

	static boolean checkValue(int len,int height)
	{
		if(len >=0 && len <=100 && height >=0 && height<=100)
		{
			return true;
		}
		else
			return false;
//		return false;
	}
	static void except()
	{
		throw new ArithmeticException("not valid");  
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("enter length");
		int len = s.nextInt();
		System.out.println("enter height");
		int height = s.nextInt();
		int area = 0;
		boolean flag = checkValue(len,height);
		
		if(flag)
		{
			area=len*height;
			System.out.print(area);
		}
			
		else
		{
			except();
		}
		s.close();
	}

}
