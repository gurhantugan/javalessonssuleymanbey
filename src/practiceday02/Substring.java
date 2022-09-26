package practiceday02;

import java.util.Scanner;

public class Substring {

	//1.Ask user to enter a word. If the word has odd number of characters //length() of characters
			//and has 3 or more characters, print the character in the middle of the word.
			
			
			//Ali => true
			//l it has odd number of characters
			//it has even number of characters
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Type the word");
		
		String str=scan.next();
		
		if (str.length()%2==1 && str.length()>=3) {
			
			System.out.println(str.charAt((str.length()-1)/2));
			// System.out.println(w.substring(mid, mid+1)); also works
			//System.out.println(word.substring(word.length()/2, word.length()/2+1));
        } else {System.out.println("Word has even number of characters");
        
        }
        
				
		
		
		
	}

}
