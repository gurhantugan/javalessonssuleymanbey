package day04concatenation01;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
	
		// If it rains, no  picnic tomorrow   in English
				// if ( it rains ) {no picnic tomorrow}  in Java
				//    if condition     if body
				// If condition is true, then if body runs, otherwise it does not run
				
				//1.Example: Get a number from user. If the number is even, print “Even” on the console.
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter an integer");
				int num1=scan.nextInt();
				System.out.println("Enter the second number");
			int num2=scan.nextInt();
//				
				if(num1%2==0) {
					System.out.println("Even");}
//				
//				//2.Example: Get a number from user. If the number is odd, print “Odd” on the console.
			if(num1%2 != 0) {
					System.out.println("Odd");
			}
//				
//				//Get two numbers from user. If they are equal to each other, print “Equal” on the console. 
				if(num1==num2) {
					System.out.println("Equal");}
//				
				
				scan.close();
				
		
			
				
			
				
				

	}

}
