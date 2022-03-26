package learn;

import java.util.ArrayList;
import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int i = 1;
		for(;;)
		{
			System.out.println("Enter string");
			String str = s.nextLine();
			if (str.isEmpty())
			{
				break;
			}
			if(str.contains("end-of-file."))
			{
//				System.out.println(str+".");
				list.add(str);
				break;
			}
			else
				list.add(str);
				
		}
		for(String val:list)
		{
			System.out.println(i+" "+val);
			++i;
		}
	}

}
