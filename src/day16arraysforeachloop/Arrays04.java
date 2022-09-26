package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		
		//Type code to find the number of words in a String
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any string...");
		String s= scan.nextLine();
		
		// How to split a string by using any character
		String words[]= s.split(" ");
	
		System.out.println(Arrays.toString(words)); // [Ali, Can, went, to, school]
		System.out.println("the number of words: " +words.length);
		
		// Count how many words starts with "a";
		
		int count=0;
		
		for (int i=0; i<words.length;i++) {
			if (words[i].startsWith("a")) {
				System.out.print(words[i] + " ");
				count++;
			}
		}
		
		System.out.println("the number of words starts with a = " +count);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
