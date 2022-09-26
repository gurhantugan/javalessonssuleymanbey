package day03scannerincrementanddecrement;

import java.util.Scanner;

public class InterviewQuestion01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		int firstNum = scan.nextInt();
		
		System.out.println("Enter the second number: ");
		
		int secondNum = scan.nextInt();
		System.out.println("Before Swap, The first number: " +firstNum + ", The second number: " +secondNum );
		
		
//		  = temp;
		
		// System.out.println("After Swap, The first number: " +firstNum + ", The second number: " +secondNum );
		
		
		// 2nd way
		
		firstNum =firstNum +secondNum;
		secondNum = firstNum - secondNum;
		firstNum = firstNum - secondNum;
		
		System.out.println("After Swap, The first number: " +firstNum + ", The second number: " +secondNum );
		
		
		scan.close();
		
		

	}

}
