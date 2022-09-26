package day17foreachloopmultidimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class foreachloop01 {

	public static void main(String[] args) {


//		// Example -1) Find the vowels in a string by using arrays
//		String s= "Learn java, earn money."; 
//		String chars []=s.split("");
//		System.out.println(Arrays.toString(chars)); //[L, e, a, r, n,  , j, a, v, a, ,,  , e, a, r, n,  , m, o, n, e, y, .]
//		
//		for(String w : chars) {
//			if(w.equalsIgnoreCase("a") || w.equalsIgnoreCase("e")||w.equalsIgnoreCase("i") || 
//					w.equalsIgnoreCase("o")||w.equalsIgnoreCase("u")) {
//						System.out.print(w +" ");
//			}
//		}
//		
//		//Example -2) Print the words ending with "n".
//		String t= "Learn? java, earn! money."; 
//		
//		System.out.println(t);
//		
//		t=t.replaceAll("\\p{Punct}", "");
//		
//		System.out.println(t);
//		
//		String word[] =t.split(" ");
//		System.out.println(Arrays.toString(word));
//		
//		for(String w : word) {
//			if (w.endsWith("n") ||w.endsWith("N")) {
//				System.out.print(w +" ");
//			}
//		}
//		

		// Example-3) Find the sum of the digits of an integer given by user by using arrays;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		String n = scan.next();
		
		String digits []=n.split("");
		System.out.println(Arrays.toString(digits));
		
		int sum =0;
		
		
		for(String w : digits) {
			sum = sum +Integer.valueOf(w);
			
			
		}
		
		System.out.println(sum);
		
		
		scan.close();
		
		
		
		
		
	}

}
