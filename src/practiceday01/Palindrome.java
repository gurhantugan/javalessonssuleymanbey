package practiceday01;

public class Palindrome {

	public static void main(String[] args) {
		
		/*
		 * Palindrome Create a program checks if a string is palindrome or not
		 */
		
//		StringBuilder stb = new StringBuilder();
//		
//
//		stb.append("ibrahim");
		
		String name ="civic";
		
		palindrome( name);
//		System.out.println(stb.toString().equals(stb.reverse().toString()));
//		
//		
//		
//		
//		
//		System.out.println(stb.toString().equalsIgnoreCase(stb.reverse().toString()));
		//palindrome civic ibrahim / miharbi
	}
	
	public static void palindrome(String name) {
		
		String reversed = "";
		
		for(int i = name.length()-1;i>=0 ; i-- ) {
			
			
			reversed += name.charAt(i);
			
			
		}
		
		if(name.equalsIgnoreCase(reversed)) {
			System.out.println("This word is a palindrome! "+name);
		}else {
			System.out.println("this word is not a palindrome "+name);
			
		}
		
	}
	
	

	
	
	
//	package Practice01;
//	public class Palindrome {
//		public static void main(String[] args) {
//			/*   Palindrome   Create a program checks if a string is palindrome or not    */
//			
//			
//			
//			
//			String str= "nalan";
//			String sum="";
//			for(int i = str.length()-1;i>=0;i--) {
//				char c=str.charAt(i);
//				sum=sum+c;
//			}
//			System.out.println(sum);
//			if(sum.equals(str)) {
//				System.out.println("palindrome");
//			}else {
//				System.out.println("not palindrome");
//			}
//		}
//	}
//	
//	
	
	
//			for ( int i =0; i<name.length() ; i++ ) {
//				
//				if( name.charAt(i)!= name.charAt(name.length()-i-1)) {
//					System.out.println("not Palindrom");
//				}
//			}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
	}	
	
