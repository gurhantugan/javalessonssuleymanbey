package day03scannerincrementanddecrement;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		
		/*
		 Type a program which calculates the area and the perimeter of a square whose side length
		is entered by user.
		Hint 1: Area of a square is length*length.
		Hint 2: Perimeter of a square is 4*length.
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the lenght of a rectangle");
		
		double lenght = scan.nextDouble();
		
		System.out.println("Enter the width of a rectangle");
		
		double width = scan.nextDouble();
		
		System.out.println("The area of rectangle = " + lenght*width);
		System.out.println("The perimeter of a rectangle = " + 2*(lenght + width));
		
		scan.close();

		
		
		
	}

}
