package day05nestedifternary;

public class TernaryGurhan {

	public static void main(String[] args) {
		/*
        If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
        */
     int num =-10;
		
		String str= (num>0) ?  "It's a positive integer" : "It's a negative integer";

		System.out.println(str);
		
		
		
		//Write a program to print the minimum of 2 integers on the console. Use ternary..
		
		int a=67;
		int b= 45;
		
		int min = a<b ? a  : b ;
		
		System.out.println(min+" is the minimum");
		
		
		//Write a program to print absolute value of an integer.
	       // abs(10)=10, abs(-5)= 5, abs(0)=0
	       // to get abs value of a negative number, multiply by -1
		
		int num1=-12;
		
		int numb = num1<0 ?num1*(-1): num1;
		
		System.out.println("the absolute value of " + num1 + " is "+numb);
		
		
		
		
		
		
	}

}
