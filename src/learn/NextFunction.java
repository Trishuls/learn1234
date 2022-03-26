package learn;

import java.util.Scanner;

public class NextFunction {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter");

//		String str = s.nextLine();
		String st = s.next();
		int a = s.nextInt();
		double d = s.nextDouble();
		
		System.out.println("String : "+st);
		System.out.println("double : "+d);
		System.out.println("Integer : "+a);
	}

}
