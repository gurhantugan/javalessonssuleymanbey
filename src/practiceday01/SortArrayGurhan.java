package practiceday01;

import java.util.Arrays;

public class SortArrayGurhan {

	public static void main(String[] args) {
		/*
	    Given the array below, sort array elements in ascending and descending order
	     */
		
		int [] array = {1,24,2,342,123,543,54,3,2};
	
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		String str ="";
		
		
		
//		for (int i=array.length-1; i>=0;i--) {
//			
//			str = str + " " +array[i];
//			
//		
//		}
//		
//		System.out.println("reverse order " + str );
	
	
	int arr[] = new int[array.length];
	int idx= 0;
		
	
	for (int i=array.length-1; i>=0;i--) {
		
		arr[idx]=array[i];
		idx++;
		
		
		
	}
	
	
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}

}
