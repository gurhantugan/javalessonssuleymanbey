package day05nestedifternary;

import java.util.Scanner;

public class NestedIf01Gurhan {

	public static void main(String[] args) {
		
		
		 /*
        Ask user to enter a password
       If the initial of the password is upper case then check if it is ‘A’ or not.
       If it is ‘A’ the output will be “Valid Password”
       otherwise the output will be “Invalid Password”
       For example; Ali ==> Valid password      -    Mark ==> Invalid
       If the initial of the password is lower case then check if it is ‘z’ or not.
       If it is ‘z’ the output will be “Valid Password”
       otherwise the output will be “Invalid Password”
       For example; zoo ==> Valid password      -    john ==> Invalid
        */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your password...");
		
		String str=scan.next();
		
		if(str.charAt(0)>='A' && str.charAt(0)<='Z') {
			if(str.charAt(0)=='A') {System.out.println("valid password");
							
			} else { System.out.println("not a valid password");
			}
			
		}
		
		else if(str.charAt(0)>='a' && str.charAt(0)<='z') {
			if(str.charAt(0)=='z') {System.out.println("valid password");
							
			} else { System.out.println("not a valid password");
			}
		
		} else {System.out.println("Initial must be a letter");
		
		}
		scan.close();
		
		
		

	}

}
