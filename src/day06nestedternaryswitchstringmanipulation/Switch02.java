package day06nestedternaryswitchstringmanipulation;

import java.util.Scanner;

public class Switch02 {

	/*
 	Ask user to enter month number.
 	You code will print all month names starts with the month whose number is given by user
 	11==> November December
 	9 ==> September October November December
 */
	/*
	 1) For whole numbers you can not use "long" in switch. But you can use short or byte or int.
	 2) Boolean cannot be used in switch
	 3) switch statement cannot be used with decimals(float and double)
	 4) char can be used in switch statement.
	 5) string can be used in switch statement.
	 6) Wrapper classes can be used for whole numbers as well.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number...");
        int monthNumber = scan.nextInt();

        switch(monthNumber) {
        
        	case 1: 
        		System.out.println("January has 31 days");
        	case 2: 
        		System.out.println("February has 28 days");
        	case 3: 
        		System.out.println("March has 31 days");
        	case 4: 
        		System.out.println("April has 30 days");
        	case 5: 
        		System.out.println("May has 31 days");
        	case 6: 
        		System.out.println("June has 30 days");
        	case 7: 
        		System.out.println("July has 31 days");
        	case 8: 
        		System.out.println("August has 31 days");
        	case 9: 
        		System.out.println("September has 30 days");
        		
        	case 10: 
        		System.out.println("October has 31 days");
        	case 11: 
        		System.out.println("November has 30 days");
        	case 12: 
        		System.out.println("December has 31 days");
        		break;
        	default:
        		System.out.println("Please, enter the number from 1 to 12");
        	
        	
        	scan.close();
        
        }
        
	}

}
