package day03scannerincrementanddecrement;

public class OrderOfOperations {

	public static void main(String[] args) {
		
		/*
		 In Math, operations must be done according to the order of operations (BEDMAS);
		 1)B : Inside brackets, operations must be done firstly
		 2)E : Exponentials must be calculated
		 3) DM : Then Division and Multiplication
		 4)AS : Then Addition and Subtraction at the end. 
		 */
		
		//   38 / 2 - ( 4 + 3 ) * 2 = ?
		
		System.out.println(38 / 2 - ( 4 + 3 ) * 2);
		
		
		// 8 + 2 * (14 - 6 / 2) -12 = ?
		
		System.out.println(8 + 2 * (14 - 6 / 2) -12);
		
		
		float exponent = (float) Math.pow(3.0f, 4.0f);
		System.out.println(exponent);
		
		System.out.println(8 + 2 * (int) Math.pow((14 - 6 / 2),3) -12);
		
		
		
		
		
		

	}

}
