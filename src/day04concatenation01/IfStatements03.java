package day04concatenation01;

import java.util.Scanner;

public class IfStatements03 {

	public static void main(String[] args) {
		// Type a code to print its season after getting a month from user

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a month");
		String month = scan.next().toLowerCase();
		
		if (month.equals("march") || month.equals("april") || month.equals("may")) {
			System.out.println("It is Spring");
		}
		
		else if  (month.equals("june") || month.equals("july") || month.equals("august")) {
			System.out.println("It is Summer");
			
		} else if (month.equals("september") || month.equals("october") || month.equals("november")) {
			System.out.println("It is Autumn");
		} else if (month.equals("december") || month.equals("january") || month.equals("february")) {
			System.out.println("It is Winter");
		} else {
			System.out.println("type the month correctly");
		}
		
		
		scan.close();
		
	}

}
