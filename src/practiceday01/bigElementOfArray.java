package practiceday01;

import java.util.Arrays;

public class bigElementOfArray {

	public static void main(String[] args) {
		
	    /*   Please find the biggest element in the given array
	         */
	        int [] array = {1,24,2,342,123,543,54,3,2};
	        
	        
//	        Arrays.sort(array);
//	        
//	        System.out.println(array[array.length-1]);
//	       
//	        
	        
	        int max = Integer.MIN_VALUE;
	        for(int w : array) {
	        	
	        	if(max<= w) {
	        		max=w;
	        	}
	        }
	        System.out.println(max);
	        
	        
	        
	        
	}

}
