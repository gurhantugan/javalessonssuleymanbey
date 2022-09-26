package day05nestedifternary;

import java.util.Scanner;

public class IfElse02Gurhan {

	public static void main(String[] args) {
		
		/*
		 Ask user to enter a character, then check whether the character is alphabet or not
		 */
	
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a character");
		
		char ch=scan.next().charAt(0);
		
		if(ch>='A' && ch<='z') {
			System.out.println("alphabet");
		}
		else {
			System.out.println("not alphabet");
		}
		
		
		
		
		
//		Scanner scan =new Scanner(System.in);
//		
//		System.out.println("Enter one character");
//		
//		char ch =scan.next().charAt(0);
//		
//		if ((ch>= 'a' && ch<='z')||(ch>= 'A' && ch<='Z')) {
//			System.out.println( "'"+ch+"'" + " is an alphabet letter");
//		}
//		else 
//		{
//			System.out.println("'"+ch+"'"+ " is not an alphabet letter");
//		}
//		
//		System.out.println("");
//		System.out.println("");
	/*
	 Ask user to enter any name of the week, then get second ,fourth, and sixth letter 
	 of the day name and print them on the console, in the same line.

	For example; if the user enters “Monday” output will be “ody”	
	 */
		
		System.out.println("Enter the name of the day");
		String s = scan.next();

for(int i=0;i<s.length();i=i+2) {
	System.out.print(s.charAt(i)+"");
}
		
		
		
		
		
		
		
	//	System.out.print(s.substring(1, 2)+ s.substring(3, 4) + s.substring(5, 6));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
