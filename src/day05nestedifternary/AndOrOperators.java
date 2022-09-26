package day05nestedifternary;

public class AndOrOperators {

	public static void main(String[] args) {
		
		//1) "and" operator "&&"
				// If you order water and coffee, then the waiter must bring both of them
				// true && true ==> true
				// true && false ==> false
				// false && true ==> false
				// false && false ==> false
				
			/*
			 2) "or" operator "||"
			 If you order water or coffee, then the waiter must bring at least one of them
			 true || true ==> true
			 true || false ==> true
			 false || true ==> true
			 false || false ==> false	
			 
			 3) "&" checks both of the conditions
			    "&&" does not check both conditions if the first one is false
			     "&&" is faster than "&"
			  
			 4) "|" checks both conditions
			    "||" does not  check the second condition if the first condition is true
			    "||" is faster than "|"    
			 */
				
				System.out.println(5>4 && 3+4==10);//false
				
				
				
				System.out.println(4*2==3 || 7-8==-1);//true
		
		
		
		
	}

}
