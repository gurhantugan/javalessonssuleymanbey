package practiceday01;

public class PalindromeGurhan {

	public static void main(String[] args) {
	
		/*
		 * Palindrome Create a program checks if a string is palindrome or not
		 */
		
		
		
		StringBuilder pln = new StringBuilder("civici");
		
		System.out.println(pln);
		
		
		if(pln.toString().equals(pln.reverse().toString())) {
			
			System.out.println(pln+ " is a palindrome");
			
		} else {System.out.println(pln + " is not a palindrome");
		
		}
		
		
		
		
		
		
//		String name ="";
		
//		for(int i=pln.length()-1;i>=0;i--) {
//			
//			name = name + pln.charAt(i);
//			
//			
//		}
//
//		System.out.println(name);
//		
//		if (pln.toString().equals(name.toString())) {
//			
//			System.out.println("it is palindrome");
//			
//		} else {
//			System.out.println("it is not a palindrome");
//		}
//		
		
	}

}
