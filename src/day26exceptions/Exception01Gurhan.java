package day26exceptions;

public class Exception01Gurhan {

	public static void main(String[] args) {

		System.out.println(division(7,3));
		System.out.println(division(13,8));
		System.out.println(division(13,0));
		System.out.println();

		
		 int arr[]= {2,8,3,7,1,9};
		 
		 System.out.println(sumOfTwo(arr,0));
		 System.out.println(sumOfTwo(arr,1));
		 System.out.println(sumOfTwo(arr,2));
		 System.out.println(sumOfTwo(arr,3));
		 System.out.println(sumOfTwo(arr,4));
		 System.out.println(sumOfTwo(arr,5));
		System.out.println(" ");
		
		
		 
		 int brr[]= {2,8,0,18,9,3};
		 
		 System.out.println(DivisionOfTwo(brr,0));
		 System.out.println(DivisionOfTwo(brr,1));
		 System.out.println(DivisionOfTwo(brr,2));
		 System.out.println(DivisionOfTwo(brr,3));
		 System.out.println(DivisionOfTwo(brr,4));
		 System.out.println(DivisionOfTwo(brr,5));
	}

	
	public static double division(int a, int b) {
		
		double result =0;
		
		try { 
			result= a/b;
			
		} catch(ArithmeticException e) {
			
			System.out.println("b can not be 0, because of "+ e.getMessage());
			
		}
		
		return result;
	}
	
	
	public static int sumOfTwo(int arr[],int i) {
		
		int result=0;
		
		try {
			
			result=arr[i]+arr[i+1];
			
		} catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("be carefull "+ e.getMessage());
			
			
		}
		
		return result;
	}
	
	
	public static double DivisionOfTwo(int brr[], int i) {
		
		double result=0;
		
		try {result=brr[i]/brr[i+1];
		
		} catch(ArithmeticException f) {
			System.out.println("do not divide by 0 because of" +f.getMessage());
		} 
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("do not use non existing index  " +e.getMessage());
		} 
		
		
		return result;
		
		
	}
	
	
}
