package learn;

public class Strings {
	public static void main(String args[]) {

		StringBuffer buffer = new StringBuffer();
		
		String str = "java";
		System.out.println(str.length());
		for(int i=str.length()-1;i>=0;i--)
		{
//			System.out.println(i);
			System.out.print(str.charAt(i));
		}
		buffer.append(str);
		
		System.out.println(buffer);
		
		buffer.insert(1, "Hello");
		
		System.out.println(buffer);
		
		buffer.replace(2, 4, "pi");
		
		System.out.println(buffer);
		
		buffer.delete(1, 2);
		
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("javacode");
		
		System.out.println(builder);
	}
}
