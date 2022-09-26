package practiceday01;

public class FibonacciSequenceGurhan {

	public static void main(String[] args) {
		
		/*
	    Type a program that will print all Fibonacci Sequence on the console
	    0, 1, 1, 2, 3, 5, 8 etc.. create a number indicate how many times you need to run?
	    
	     */
		
		int n=10;
		
		
		int num1=1;
		
		int num2=1;
		
		int temp1 =0;
		
		
		for (int i=0; i<n; i++) {
			
			System.out.print(num1 +", ");
			
			
			temp1 =num1 +num2;
			
			num1= num2;
			
			num2= temp1;
			
			
			
			
					
		}
		
		
		
		

	}

}
