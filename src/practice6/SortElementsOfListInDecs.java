package practice6;





import java.util.Collections;


import java.util.*;
		public class SortElementsOfListInDecs {
			
			
			public static void main(String args[]) {
				//Sort all elements of list in reverse order / descending order
				
				
			      ArrayList<Integer> myList = new ArrayList<Integer>();
			      myList.add(30);
			      myList.add(99);
			      myList.add(12);
			      myList.add(23);
			      myList.add(8);
			      myList.add(94);
			      myList.add(98);
			      myList.add(66);
			      
			     Collections.sort(myList, Collections.reverseOrder());
			     System.out.println(myList);
			   
			}
			
		
	}

		/*
		 * Collections.sort(myList);
	      Collections.reverse(myList);
		System.out.println(myList);
		 */

