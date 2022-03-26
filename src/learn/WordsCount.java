package learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str = s.nextLine();
		
		str = str.toLowerCase();
		
		String[] arr = str.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			int count = 0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
				}
			}
			hm.put(arr[i], count);
		}
		for(Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" = "+m.getValue());
		}
	}
}
