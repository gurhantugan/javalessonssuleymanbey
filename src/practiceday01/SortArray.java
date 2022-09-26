package practiceday01;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		/*
	    Given the array below, sort array elements in ascending and descending order
	     */

		int [] array = {1,24,2,342,123,543,54,3,2};
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
	
		for (int i=0; i<array.length;i++) {
			
			for (int j=i+1; j<array.length;j++) {
				
				if (array[i]<=array[j]) {			// if (array[i]>=array[j]) it will be opposite
					
					int temp = array[i];
					array[i]= array[j];
					
					array[j]=temp;
				}
			}
		}
		
		
		
		System.out.println(Arrays.toString(array));
		
		
	
		
		
		
		
		
//		int arr2[] = new int[array.length];
//	    int ind = 0;
//	    for(int i = array.length-1; i>=0; i--) {
//	    	arr2[ind] = array[i];
//	    	ind++;
//	    }
//		 System.out.println("Descending order" + Arrays.toString(arr2));
//			

		
		
		
		
		
		
		}
		
	}




//
//int [] rev = new int [array.length];
//
//int k=0;

//for (int i = 0; i<array.length; i++) {
//	rev[i] = array[array.length-1-k];
//	k++;
//}
//
//System.out.println(Arrays.toString(rev));
//}
//
