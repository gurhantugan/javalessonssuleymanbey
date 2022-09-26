package day11loops;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		/*
		 * For the String “1234_?!abcdef”, type a code to count the number of letters,
			 the number of digits and the number of others by using do-while loop
		 */
		
		
		String s= "1234_?!abcdef";
		
		
		// 1st way ; do while 
		s=s.toLowerCase();				// in the case of writing capital letters!!!
		
		int digitCounter =0;
		int letterCounter =0;
		int othersCounter =0;
		
		
		int idx =0;
		
		
		do {
			if(s.charAt(idx)>='a' && s.charAt(idx)<='z') {
				letterCounter =letterCounter +1;		// or write: letterCounter++
				
			} else if (s.charAt(idx)>='0' && s.charAt(idx)<='9') {
				
				digitCounter++;
			} else {
				othersCounter++;
			}
			
			idx++;
			
		} while (idx<s.length());
		
		System.out.println("Letters:" +letterCounter);
		System.out.println("digits:" +digitCounter);
		System.out.println("others:" +othersCounter);
		
		
		
		//2nd way: reg ex method:
		
		String t ="A5b!";
		
		String justDigits = t.replaceAll("[^0-9]", "");
		System.out.println("Number of digits:" + justDigits.length());
		
		String justLetters = t.replaceAll("[^a-zA-Z]", "");
		System.out.println("Number of letters:" + justLetters.length());
		
		String differentFromLettersAndDigits = t.replaceAll("[a-zA-Z0-9]", "");
		System.out.println("Number of others:" + differentFromLettersAndDigits.length());
		
		// ATM machine uses do while method. you directly enter your password
		
	}

}
