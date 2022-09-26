package day02variablesscanner;

import java.util.Scanner;

public class Day02Scanner02 {

	public static void main(String[] args) {
	
	
	Scanner scan= new Scanner(System.in);
	
	
	System.out.println("enter your first number");
	
	double num1=scan.nextDouble();
	
	
	System.out.println("enter your second number");
	
	double num2=scan.nextDouble();
	
	System.out.println("The sum of two numbers = "+(num1+num2));
	scan.close();
	
	}

}
