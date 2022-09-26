package day29exceptions;

public class Exception02 {

	public static void main(String[] args) {
		
		divide(5,2);		// no red underline. because this is RTExpetion.
		divide(5,1);
		/* THIS IS TECHNICAL MESSAGE;
		 * Exception in thread "main" day29exceptions.DivideByOneException: No need to divide by a number 1
	at day29exceptions.Exception02.divide(Exception02.java:13)
	at day29exceptions.Exception02.main(Exception02.java:8)
	
	IF YOU DO NOT WANT TO SEE THAT MESSAGE YOU CAN USE try catch block
		 */
	}

	public static void divide(int a, int b) {
		try {
			if(b==1) {
				throw new DivideByOneException ("No need to divide  a number by 1");
						
		}else {
			System.out.println("Result is "+ a/b);
		} 
		}catch(DivideByOneException e) {
			System.err.println(e.getMessage());
		}
			
		}
			
		
		
}


// Create Custom Runtime Exception
/*
 * 1) To create a run time exception follow the same steps in Compile Time Exception Creations. 
 * 		Just change the extended class name from "Exception" to "RuntimeException".
 * 2) when you call a method which throws Compile Time Exception, you will get red underline but
 * 		when you call a method which throws Runtime  Exception, you will not.
 * 
 * 
 */
class DivideByOneException extends RuntimeException{
	
	public DivideByOneException (String message) {
		
		super(message);
	}
}




