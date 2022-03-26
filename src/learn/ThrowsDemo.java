package learn;

import java.io.IOException;

public class ThrowsDemo {
	void m(int age)throws IOException{
		if (age<18)
			throw new IOException("Not eligible");//checked exception
		else
			System.out.println("Eligible");

	  }
	  void p(){  
	   try{
		   m(15);
	   }catch(Exception e){System.out.println("exception handled");}
	  }  
	  public static void main(String args[]){  
		  ThrowsDemo obj=new ThrowsDemo();  
	   obj.p();  
	   System.out.println("c:\\demo.txt");  
	  }  
}
