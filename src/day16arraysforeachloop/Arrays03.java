package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Check if a specific element exists in an array

		int arr[]={34, 12, 21, 12,45};
		
//1. way
		int expectedElement = 11;
		int counter=0;
		
		
		
		for (int i=0; i<arr.length;i++) {
			if (expectedElement==arr[i]) {
				counter++;
				break;
			}
		
		}
		if (counter==1) {
			System.out.println(expectedElement + "exist in the array.");
			
		} else {
			System.out.println(expectedElement + "does not exist in the array.");
		}
	
		//2. way;
		// a)  binarySearch() returns the index of the expected element if the element exists.
		//b) binarySearch() returns returns negative integer for non-existing elements. The value represents the order number.
		// if the element exist.
		// c) Before using binary search () method you have to use sort() otherwise the output will be meaningless.
		// (like before eating wash your hands
		// binarySearch() does not give stable outputs for repeated values.
		
		Arrays.sort(arr);
		System.out.println("Binary search Result: " + Arrays.binarySearch(arr, expectedElement));  // "-" means does not exist
	
	
	
	
	
	
	
	
	}

}
