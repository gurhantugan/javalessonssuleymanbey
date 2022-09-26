package day07stringmanipilations;

public class StringManipulation01 {

	/*
	 Regex(Regular Expression): Regex is used to declare a group of characters
	 	i) All lower case letters ===> [a-z]
	 	ii) All upper case letters ===> [A-Z]
	 	iii) All upper and lower case letters ===> [a-zA-Z]
	 	iv) All characters different from space character ==> \\S......... upper case means different from space.
	 	v) space character ==> \\s
	 	vi) All characters different from digits ==> \\D
	 	vii) All digits ==> \\d
	 	viii) regular expressions for java just google it.
	 	ix) [^a-zA-Z] means all characters except letters.
	 	x) Characters from a to z, from A to Z, from 0 to 9 and _ ==> "\\w"
	 	xi) Characters different from a to z, from A to Z, from 0 to 9 and _ ==> "\\W"
	 	
	 	
	 	
	 */
	
	
	public static void main(String[] args) {

		String str1 = "Java is Java";

		System.out.println(str1.indexOf("v",2));
		
		
		 // 1)Type code to find the number of space character in a String.
		
		String s1 = "Ali went to the school.";
		//String updateds1=s1.replaceAll("[a-z]", "").replaceAll("[A-Z]", "");
		// 2. way
		
		String updateds1=s1.replaceAll("\\S", "");
		
		System.out.println(updateds1.length());
		
		
		// 2)
		
		//1st way: 
		//Number of all characters - Number of Characters different from space
		int numfCharsDiffFromSpace =s1.length() - updateds1.length();
		System.out.println(numfCharsDiffFromSpace);
		
		//2. way: find the characters different from space directly.
		
		String updated2s1= s1.replaceAll("\\s", "");
		
		System.out.println(updated2s1.length());
		
		/*3)Type code to  find the number of digits, number of letters, 
		and characters different from digits and numbers.
		*/
		
		String s2 = "Ali Can: 1234567890 !!! ? .  ";
		
		String updateds2=s2.replaceAll("\\D", "");
		// "[^0-9]" is same as "\\D"
		
		System.out.println(updateds2.length()); //10 digits
		
		String updated2s2=s2.replaceAll("[^a-zA-Z]", "");    
		// [^a-zA-Z] everything except letters.
		
		
		System.out.println(updated2s2);
		
		// to find characters:
		
		String updated3s2 = s2.replaceAll("[a-zA-Z0-9]", ""); 
		// replace digits and lower and upper cases with nothing means remove them. so just special characters left. 
		System.out.println(updated3s2.length());
		
		
		/*
		 4)Check the password according to the given rule
			a)No space character at the beginning and at the end
			b)It must contain at least 1 digit
			c)It must contain at least 1 lower case letter
			d)It must contain at least 1 upper case letter
			e)It must contain at least 1 character different from digits and letters
		 */
		
		String pwd = "123Dac";
		
		boolean isFirstCharSpace =pwd.startsWith(" ");
		System.out.println(isFirstCharSpace);//true
		
		boolean isLastCharSpace =pwd.endsWith(" ");
		System.out.println(isLastCharSpace);// false
		
		int numOfDigitsChars = pwd.replaceAll("\\D", "").length();
		
		int numOfLowerCaseChars = pwd.replaceAll("[^a-z]", "").length();
		
		int numOfUpperCaseChars = pwd.replaceAll("[^A-Z]", "").length();
		
		int NumOfCharDiffFromLeeterAndDigit =pwd.replaceAll("[a-zA-Z0-9]", "").length();
		
		if (isFirstCharSpace) {
			System.out.println("Your password is invalid, do not use space at the beginning");
		}
		 if (isLastCharSpace) {
			System.out.println("Your password is invalid, do not use space at the end.");
			}
		  if	(numOfDigitsChars==0) {
			 System.out.println("Your password is invalid, Use at least one digit.");
		 }
		 if	(numOfLowerCaseChars==0) {
			 System.out.println("Your password is invalid, Use at least one lower case letter.");
			 }			
		if	(numOfUpperCaseChars==0) {
			 System.out.println("Your password is invalid, Use at least one upper case letter.");
		 
		 }
			 
		 
			 if	(NumOfCharDiffFromLeeterAndDigit==0) {
				 System.out.println("Your password is invalid, Use at least one character different from letters abd digits.");
			 }
		
		
	}

}
