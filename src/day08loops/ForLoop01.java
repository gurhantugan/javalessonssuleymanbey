package day08loops;

public class ForLoop01 {

	public static void main(String[] args) {

/*
 Type code to print "Hello!" on 3 different lines (not recommended)
 */
		
		// 1st way
//		System.out.println("Hello!");
//		System.out.println("Hello!");
//		System.out.println("Hello!");
		
		//2nd way
		// We use loops for repeating tasks
		// The loops are :
							// 1) for-loop
							// 2) while-loop
							// 3) do-while-loop
							// 4) for-each-loop
		
		// for-loop: frame work
		
		//for (          ;             ;            ) {							}
		
//		for ( int i = 1 ;  i<4  ;  i++  ) {
//			System.out.println("Hello!");			
//			}
//		
//	
//		//Example: 
		        //Type all integers from 11 to 44 in the same line with a space between consecutive integers	
//		
//		
//		for (int i=11 ; i<45  ; i++) { System.out.print(i+ " ");
//			
//		}
//		
		
		//example: Type all even integers from 11 to 120 in the same line with a space between consecutive integers
		
//		for (int i=12 ; i<121  ; i=i+2) { System.out.print(i+ " ");}
//		
//		
//		//2nd way:
		
		for (int i=11 ; i<121  ; i++) { if(i%2==0) { System.out.print(i+ " ");}
//		
		}
//		
		
		System.out.println("=============================================");
		
	//Example: Type all odd integers from 120 to 11 in the same line with a space between consecutive integers	
		
		for (int i=120 ; i>10  ; i--) { 
			if(i%2==1) {
				
				System.out.print(i+ " ");
				
}
			
		}
		
				
				System.out.println("=============================================");		
				
				
		/*
		 *Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 
		 in the same line with a space between consecutive integers		
		 */
				
				System.out.println("=============================================");	
				
				for (int i=120 ; i>10  ; i--) { 
					if(i%4==0 && i%6==0) {
						
						System.out.print(i+ " ");
						
		}
					
				}		
				
		
				System.out.println("=============================================");
				
				//Example:
		//		Using the String "Java", type "J*a*v*a*" on the console		
				
				
				String s="Javarst";
				
				for(int i=0 ; i<4 ; i++) {System.out.print(s.charAt(i)+"*");
					
				}
				// Upper one is not dynamic. it stops after the 4th character.!!!
				
				
				System.out.println("=============================================");
				
			// To make it dynamic we use length method for i< part
				
				for(int i=0 ; i< s.length() ; i++) {System.out.print(s.charAt(i)+"*");
				
				}
				
				System.out.println("=============================================");
				System.out.println("=============================================");
				
				// another way 
           for(int i=0 ; i<= s.length()-1 ; i++) {System.out.print(s.charAt(i)+"*");
				
				}	
			
		
		//Example:
                //Type code to print all unique characters on the console from a given String
           		// Java===> Jv
           
           // hint: if it is not unique first index !=last index
           
           String s1="Javalalo";
           
           for (;;) {
        	   
           }
          
           // bir cozum
           
           /*
            for(int i=0; i<str.length();i++) {
		if(i%2==0) {
			System.out.print(str.charAt(i)+" "); 
		}
	}
            */
           
		// diger bir cozum
           
           /*
		  String str = "Java";   
        
        for(int i = 0 ; i < str.length() ; i++) {
            
            char c = str.charAt(i);
            
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.print(c+" ");
            }
        
        
        }
C
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
