package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

	public static void main(String[] args) {
		// Find the longest word in a string
		
		String s= "Ali Can went to a school to learn";
		
		String words[]=s.split(" ");
		System.out.println(Arrays.toString(words)); //[Ali, Can, went, to, a, school, to, learn]
		
		Arrays.sort(words, Comparator.comparing(String::length).reversed());
		System.out.println(Arrays.toString(words));
		
		System.out.println(words[0]);
		
		
		// Get just the year from date in the "mm/dd/yyyy" format.
		
		String date= "10/05/2021";
		String arr[]= date.split("/");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[2]); //2021
		
		
		// Get the initials of the students names.
		// hint: use comma and space===> ", "
		String t="Ali Can, Veli Han, Mary Star went to school by bus";
		
		String u[]=t.split(", "); // {Ali Can, Veli Han, Mary Star went to school by bus]
		System.out.println(Arrays.toString(u));
		
		
		String initials="";
		for(int i=0; i<u.length; i++) {
			
			initials= u[i].subSequence(0, 1) + u[i].substring(u[i].indexOf(" ")+1, u[i].indexOf(" ")+2);
			
			System.out.print(initials + " ");
			
		}
			/*2nd way:
			 * String initials = "";
​
		for(int i=0; i<u.length; i++) {
	
			int idx = u[i].indexOf(" ");
			
			initials = u[i].substring(0,1) + u[i].substring(idx + 1, idx + 2);
					
			System.out.print(initials + " ");
			 * 
			 */
			
		
		
	}

}
