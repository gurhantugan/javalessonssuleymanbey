package day03scannerincrementanddecrement;

public class Increment01 {

	public static void main(String[] args) {
		
	// Increment is to increase the value of a number variable by "+" and "*"
	// 1st way: 
	
		int num1 = 3;
		num1 = num1 + 2;
		
		System.out.println(num1);
		
		num1 = num1 +10;
				System.out.println(num1);		
				
		
		num1 = num1*2;
		System.out.println(num1);
		

		// 2nd way;
		 num1 += 4 ; 
		
		System.out.println(num1);
		
		num1 *=3;
		
		System.out.println(num1);
				
		// 3rd way is only for increasing by 1
		num1++;
		System.out.println(num1);
		
		
		
		
	}

}
