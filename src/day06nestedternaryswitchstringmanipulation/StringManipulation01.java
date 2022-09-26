package day06nestedternaryswitchstringmanipulation;

import java.util.Scanner;

public class StringManipulation01 {

	public static void main(String[] args) {
//		
	Scanner scan =new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = scan.nextLine();
//		
		
//		// Print the first and last character of the given String on the console.
//		// ex: "Java is easy" ==> Jy
//		// Last index will be 1 less than the number of characters.
//		
//		//How can we find the number of a character number of character in a string?
//		// Ans: str.lenght():==> returns the number of character.
//		
	char firstChar = str.charAt(0);
	char lastChar = str.charAt(str.length()-1);
	
		if(str.length()==1) {
			System.out.println(firstChar);
					}
		else {
			System.out.println(""+ firstChar +lastChar);
		}
	
		//Print the index of first occurrence of 'a' if 'a' exist otherwise print no 'a'.
	
		int idx = str.indexOf("a"); // Windows ==> Ctrl + Hover over
		
 	if(idx==-1) {
			System.out.println("No 'a'");
	} else 
	System.out.println(idx + "is the index");	
 	
		// Note-1: If you use non-exiting character in indexOf() method or lastIndexOf() method, you will get -1.
//		// Note-2: indexOf() method or lastIndexOf() method works with char and works with String
//		// Note-3: If you use multiple characters in indexOf(), it returns the index of first character.
//		// Note-4: indexOf() and lastIndexOf method works with first and last occurrences correspondingly every time.
//	
//		
//		
//		//Print the index of last occurrence of a spesific character.
		int lastIdx = str.lastIndexOf("a");
 		
		System.out.println(lastIdx);
//
//		// ***Check if a given character is unique in a String or not?
//		
		char c = 'v';  
		//Put the value inside of a container and put the name of container inside of indexOf() method.
		str.indexOf(c);
//		
		int firstOccurrenceIdx = str.indexOf(c);
		int lastOccurrenceIdx = str.lastIndexOf(c);
//		
	if(firstOccurrenceIdx==-1) {
		System.out.println(c + " does not exist");
	}
		
	else if(firstOccurrenceIdx==lastOccurrenceIdx) {
		System.out.println(c + " is unique");
		} else {
			System.out.println(c + " is not unique");
		}
//		
//		
//		 
//		
		char initilaOfFirstName = str.charAt(0);
		char initilaOfLastName = str.charAt(str.indexOf(" ") +1);
//		
	System.out.println(" "+initilaOfFirstName +initilaOfLastName);
//		
//		
//		//Get the characters from index 3 to index 7 from a String
//		
//		
		String sub = str.substring(3, 8); //In substring method first index is inclusive, but second index is exclusive.
		
		System.out.println(sub); // Gurhan Tugan==> han T
		
//		//Get the characters from index 3 to the end  from a String
//		
		String sub1 = str.substring(3, str.length()); 
//		
//		
				System.out.println(sub1);//Gurhan Tugan==> han Tugan
//		
//		
//		/* There are two substring() methods. 
//		 1)First one has 2 parameters.
//		  It is used to get a part of a string from starting index(inclusive) to the end of index(exclusive)
//		  
//		2) Second one has a single parameter, It is used to get a part of a string from starting index(inclusive) to the end.
//		
//		
//		*/
//		
//		
//		/*
//		 
//		 String shirtPrice = $12.99
//		 String trouserPrice = $ 25.99
//		 
//		 Type code to calculate the sum of the shirt and the trouser prices.
//		 
//		 
//		 */
		
		
		String shirtPrice = "$12.99";
		String trouserPrice = "$25.99";
		
		String updatedshirtPrice =shirtPrice.replace("$", "").replace(".", "");
		
		System.out.println(updatedshirtPrice);
		
        String updatedtrouserPrice =trouserPrice.replace("$", "").replace(".", "");
		
		System.out.println(updatedtrouserPrice);
		
		System.out.println((Integer.valueOf(updatedshirtPrice) + Integer.valueOf(updatedtrouserPrice))/100.0);
		
		
		
	}

}
