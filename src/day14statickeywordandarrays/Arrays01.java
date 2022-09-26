package day14statickeywordandarrays;

import java.util.Arrays;

/*
 * Arrays:  1) Arrays are to store multiple data in a single container.
 * 			2) All data in an array must be same type.
 * 			3) Arrays can accept only "primitives" and "references" as an element.
 * 				Array cant accept non-primitive data types.
 * 			4) Array is non-primitive.
 * 
 */
public class Arrays01 {

	public static void main(String[] args) {
		
		//How to create array?
		int [] arr1= new int[4]; // possible creation int[] arr1 , OR  int  arr1[]
		// How to print array?
		System.out.println(arr1);   //it turns the address of array [I@5d22bbb7
		System.out.println(Arrays.toString(arr1)); //[0, 0, 0, 0]
		
		// How to add elements in array?
		arr1[0]=4;
		System.out.println(Arrays.toString(arr1));	//[4, 0, 0, 0]
		
		arr1[3]=8;
		System.out.println(Arrays.toString(arr1));	//[4, 0, 0, 8]
		
		//make second element 7 and third element 10
		arr1[1]=7;
		System.out.println(Arrays.toString(arr1));	//[4, 0, 0, 0]
		
		arr1[2]=10;
		System.out.println(Arrays.toString(arr1));	//[4, 0, 0, 8]
		
		// How to print a specific element on the console?
		System.out.println(arr1[0]);	//4
		//System.out.println(arr1[4]);	// ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
										// this is not CTE(compile time error)
										// if we get error message after we run the code, it is Run Time Error.
		
		// How to get the number of elements in an array?
		System.out.println(arr1.length);
		
		// How to get the first element?
		 System.out.println(arr1[0]);
		 
		// How to get the last element?
				 System.out.println(arr1[arr1.length-1]);
		
		// How to put elements in ascending order?
				 
				 Arrays.sort(arr1);  // sort () method updates array.
				 System.out.println(Arrays.toString(arr1));
				 
		// How to print the smallest element on the console?
			// Firstly we use sort() method to put elements from smallest to biggest, 
				 // then the element at "index 0" is the smallest element. 
				 // for the biggest element ............. index 'arr1.length-1'
				System.out.println(arr1[0]); 
				 System.out.println(arr1[arr1.length-1]);
				 
				 
				 
				 // Create a String Array, put "Ali", "Veli", "Mete", "Can"
				 // Sort the element
				 // Find the last element after sort() method
				 
				 String arr2[] = new String [4];
				 
				 arr2[0]= "Ali";
				 arr2[1]= "Veli";
				 arr2[2]= "Mete";
				 arr2[3]= "Can";
				 
			
				 /* 2. way:
				  *
				  * String arr5[] = {"ali", "veli", "mete","can"};
        			Arrays.sort(arr5);
        			System.out.println(Arrays.toString(arr5));
        			System.out.println(arr5[arr5.length-1]);
				  */
				
				 
				 Arrays.sort(arr2);
				 
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr2[arr2.length-1]);
				 
		
	}

}
