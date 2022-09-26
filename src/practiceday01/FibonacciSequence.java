package practiceday01;

public class FibonacciSequence {
	/*
    Type a program that will print all Fibonacci Sequence on the console
    0, 1, 1, 2, 3, 5, 8 etc.. create a number indicate how many times you need to run?
    
     */
	
	
	
	public static void main(String[] args) {
	
		int n=10;
		
		int firstTerm=0;
		int secondTerm=1;
		
		
		for(int i=0 ; i<=n; i++) {
			System.out.print(firstTerm+ ", ");//0, 1
			
			int temp=firstTerm + secondTerm;	//1
			
			firstTerm = secondTerm;
			
			secondTerm = temp;
			
			
		}
		
		
//		public static void main(String[] args) {
//			
//			{    
//				 
//				int n=10; int firstTerm =0; int secondTerm= 1; 
//				
//				int i = 0;
//				int thirdTerm = 0;
//				       
//				 
//				 System.out.print(firstTerm+" "+secondTerm);
//				 
//				    
//				 for(i=2;i<n;++i)   
//				 {    
//				  thirdTerm=firstTerm+secondTerm;    
//				  System.out.print(" "+thirdTerm);    
//				  firstTerm=secondTerm;    
//				  secondTerm=thirdTerm;    
//				 }    
//				  
//				}
//		}
//	}
		
		
		

	}

}
