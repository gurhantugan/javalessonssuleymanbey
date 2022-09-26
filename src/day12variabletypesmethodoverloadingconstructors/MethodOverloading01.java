package day12variabletypesmethodoverloadingconstructors;

public class MethodOverloading01 {

	/*
	 * Method overloading: If you use method name for different methods, it is called "Method overloading"
	 * 
	 * Question: How do you achieve "Method overloading"?
	 * 			1) by using different number of parameters. For example: first one has two parameters, 
	 * 				second one has 3 parameters 
	 * 			2) by using different data types for parameters
	 * 			3) if the data type of parameters are different you can change the order
	 */
	public static void main(String[] args) {
	//	add(13,15);// the sum is 28This is "method call"
		
		MethodOverloading01.add(13, 15, 32);
		// when you create a method, if you create a variable inside the
		// method parenthesis, it is called parameters.
		// real values used for parameters in method are called "Arguments"

		add(3, 5.2);		// java will choose 4th method. it is called "Method Selection"
		
		add (1.2,5);		// method selection is 3rd one
		
		add(2, 3);			// 1st, 3rd and 4th method. Integer can be put into double. "auto widening"
							// Java will select the just 1st way. because it has less work than 3rd and 4th
							// there is no auto widening
	}

	public static void add(int a, int b) { 
		System.out.println("the sum is "+(a+b));
	}
	
	public static void add(int a, int b, int c) {
		System.out.println("the sum is "+(a+b+c));
		
	}
	public static void add(double x, int y) {		// 1 autowidening. Java choose this one.java is lazy.
		System.out.println("*the sum is "+(x+y));
	}
	
	public static void add(double x, double y) {	// 2 autowidening
		System.out.println("the sum is "+(x+y));
	}
}
