package day09loops;

public class ForLoop01 {

	public static void main(String[] args) {
		
	//1)Type code to print unique characters on the console
		
		String s1= "Javajvq";
	
		for (int i=0 ; i<s1.length(); i++) {
		char c = s1.charAt(i);
			if (s1.indexOf(c)==s1.lastIndexOf(c)) {System.out.print(c);
				
			}
			
		}
		
	System.out.println("");
	System.out.println("................................");
	// 2) Find the sum of integers from 12 to 15;	
	
	int sum =0;
		
		for (int i=12; i<15; i++) {
			sum = sum + i;
			
		}
		
		System.out.println(sum);
		
		System.out.println("");
		System.out.println("................................");	
		
		//3)Type code to find the product of the integers from 3 to 5
		
		
		int product =1;
				for (int i=3;i<6;i++) {
					
				product = product*i;
				
				System.out.println(product);
				}
		
				System.out.println(product);
				
		// {yani parantez icine yazica 3 tane sonuc veriyor***===> 3,12,60
		// { yani parantez disina yazinca tek sonuc veriyor.===> 60
				
				
			
		
		
		System.out.println("");
		System.out.println("................................");
		
		
		/*4) A string is given. Create the String which is the reverse of the given String
		 *  without spaces, then print it on the console
				
				Example: Ali Can ===> naCilA */
		
		String s2 = "Ali Can";
		String reversed ="";   // Empty 
		
		for (int i =s2.length()-1 ; i>=0 ; i--) {
			
//			1st way char method:
			
//         char c= s2.charAt(i);
//			if (c !=' ') {
//				reversed = reversed +c;
//				
//			}
//			System.out.println(reversed);   // sonuca bak cok ilginc
//		}
//		 System.out.println(reversed);
		
		// 2nd way
		 String ss=s2.substring(i, i+1);
		 if(!ss.equals(" ")) {
			 reversed= reversed + ss; 
			 
		 }
			 
		} 
		 
		 
		 
		// basta replace method ile space i kaldirirsan hic if methoda gerek kalmaz
		 
		 /*
		  * guzel bir yol daha .............arif can yapti
		  * 
		  * String str="Ali Can";
	for(int i=str.length()-1; i>=0; i--) {
		System.out.print( (str.charAt(i)!=' ') ? (str.charAt(i) ): ("") );
	}
		  * 
		  * 
		  * 
		  */
		
		
		
		
		System.out.println("");
		System.out.println("................................");
		
		
		/*
		 * 5)Type code to check if a given String is Palindrome.
			String: anna ---------Reversed String: anna
			Integer: 12321 ------ Reversed Integer: 12321
		 */
		
		
	
		String s3= "annana";
		String reversedOfs3 = "";
		for (int i = s3.length()-1 ; i>=0    ;   i--) {
			reversedOfs3 = reversedOfs3 +s3.charAt(i);
			
		}
		
		if(reversedOfs3.equals(s3)) {System.out.println(s3 + " is a palindrome");
			
		} else {
			{System.out.println(s3 + " is not a palindrome");
		}
		
		}
		System.out.println("");
		System.out.println("................................");
			
		
		//example-6)Type code to find the sum of the digits of an integer
		
		int sumOfDigits=0;
		
		for (int i =1234 ;	i>0	;	i=i/10	) {
			
			sumOfDigits= sumOfDigits + i%10;
			
			System.out.println(sumOfDigits);      // heh heh heeeee
		}
		
		
		System.out.println(sumOfDigits);
		
		/*
		 * 1234 %10 =4
		 * 1234/10= 123
		 * 123%10 = 3
		 * 123/10= 12
		 * 12%10 = 2
		 * 12/10 =1
		 * 1%10 = 1
		 * 1/10 = 0 loop is broken here. we go out of loop to syso!!!
		 */
		

		//7)Type code to find the sum of the unique digits of an integer.
		
		
		// turn character to number.....
		
		String s5= "1233422567";
		
		int sum5 =0;
		
		for (int i=0 ; i<s5.length();i++) {
			char c5 =s5.charAt(i);
			if (s5.indexOf(c5)==s5.lastIndexOf(c5))
			{
				String sn =""+ c5;
				sum5 =sum5 + Integer.valueOf(sn);
			
							
				
			}
		}
		System.out.println(sum5);
		
		
		/* ayri bir cozum
		 * 
		 * Integer ix;
	int sum=0;
for( Integer i=123344556; i>0; i=i/10) {
	ix=i%10;
	
		if ( i.toString().indexOf(ix.toString())==i.toString().lastIndexOf(ix.toString()) ) {
			sum=sum+i%10;
		}
	}System.out.println(sum);
		 */
		
		
		
		
		
		
		
		
	}

}
