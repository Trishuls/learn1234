package learn;

public class stringBuff {

	public static void main(String[] args) {
 
			StringBuilder sb=new StringBuilder("Hello ");
			System.out.println(sb.capacity());
			sb.insert(6,"Java");//now original string is changed
		sb.append("love");
		sb.delete(10,14);
		System.out.println(sb);
			sb.reverse();
			System.out.println(sb.capacity());
			System.out.println(sb);//prints HJavaello  
	}
}
