package learn;

public class Pattern 
{
	static void printPattern(int n)
	{
//		for(int i = n;i>1;i--)
//		{
//			for(int k=n-i;k>1;k--) {
//				System.out.print(" ");
//			}
//			for(int j=n;j>=1;j--)
//			{
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
//		for (int i=0; i<n; i++) 
//        { 
//  
//            // inner loop to handle number spaces 
            // values changing acc. to requirement 
//            for (int j=n-i; j>1; j--) 
//            { 
//                // printing spaces 
//                System.out.print(" "); 
//            } 
//   
//            //  inner loop to handle number of columns 
//            //  values changing acc. to outer loop 
//            for (int j=0; j<=i; j++ ) 
//            { 
//                // printing stars 
//                System.out.print("* "); 
//            } 
//   
//            // ending line after each row 
//            System.out.println(); 
//        }
		int i,j;
		 for(i=0; i<n; i++) 
	        { 
	  
	            // inner loop to handle number spaces 
	            // values changing acc. to requirement 
	            for(j=2*(n-i); j>=0; j--) 
	            { 
	                // printing spaces 
	                System.out.print(" "); 
	            } 
	             
	            //  inner loop to handle number of columns 
	            //  values changing acc. to outer loop 
	            for(j=0; j<=i; j++) 
	            { 
	                // printing stars 
	                System.out.print("* "); 
	            } 
	              
	            // ending line after each row 
	            System.out.println(); 
	        } 
	}

	public static void main(String[] args)
	{
		int n = 5;
		printPattern(n);
	}
}
