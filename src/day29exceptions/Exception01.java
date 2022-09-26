package day29exceptions;

public class Exception01 {

	public static void main(String[] args) {
		// you have to use throw or throw method to get rid of red underline for checkGrade(200);
		try {
			checkGrade(75);
			checkGrade(200);	// it gives red underline because of CTException. Fix it.
		} catch (IllegalGradeException e) {					
			
			System.out.println(e.getMessage());
		}					
		
	}

	public static void checkGrade(int grade) throws IllegalGradeException {
		
		if (grade<0 || grade>100) {
			
			throw new IllegalGradeException("Do not make the grade less than 0 or greater than 100");
		} else {
			System.out.println("Your grade is " +grade);
		}
	}
	
}

// Create Custom Compile Time Exception(out of the first class)(You need to extend to Exception)
//You need to create constructor as well.

/*
 * 1) you have to extend to "Exception " class like "extend Exception"
 * 2) to be able to put "exception message" on the console, you should create constructor with String parameter like
 * 		IllegalGradeException(String message) 
 * 3) Inside the constructor call parent constructor with the message argument like super(message);
 * 4) After creating your own exception class you can use it in any method body whenever you need by typing like 
 * 	“throw new IllegalGradeException(“Do not make the grade less than 0 or greater than 100");”
 */

 class  IllegalGradeException extends Exception{
	
	public  IllegalGradeException(String message) {		// to give the message I create constructor. it will print on the console
		super(message);									// super is to print our message in parents Exception class. we do not write code.
														// constructor put my message at the end of the line.
														// why am I create my own constructor inside the class? to show my message at the end of the line.
														// and I need to call my parent Exception constructor. parent constructor is creating code
														// we do not need to create code for the message.
		
	}
	
}
