package day11loops;

import java.util.Scanner;

public class DoWhileLoop04 {

	public static void main(String[] args) {
		
		/*
		 * Username ise "admin", Password is "pwd123"
	 	Ask user to enter username and password
	 	User should see "Enter your username and password" message
	 	If he enters correct credentials he should get "You are in your account!" message
	 	Otherwise, he should see "Enter your username and password" message 3 times
	 	After 3 times he should get "Your account is blocked" message
		 */

		Scanner scan =new Scanner(System.in);
		
		String userName = "";
		String password = "";
		
		int counter = 0 ;
		
		do {
			System.out.println("Enter your username and password");
			userName =scan.next();
			password = scan.next();
			
			if (userName.equals("admin") && password.equals("pwd123")) {
				System.out.println("You are in your account!");
				break;					// if correct it breaks the loop.
			}
			
			if(counter==3) {
				System.out.println("Your account is blocked");
				break;					// after 3 trial loop is broken  
			}
			
			counter++;
			
		} while(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
