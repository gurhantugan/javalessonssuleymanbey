package practiceday01;

import java.util.Arrays;

public class bigElementOfArrayGurhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//   Please find the biggest element in the given array
         
        int [] array = {1,24,2,342,123,543,54,3,2};
        
//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);
//		
		
        int min = Integer.MIN_VALUE;
        
        for(int w: array) {
        	
        	if (min<=w) {
        		
        		min=w;
        		
        	}
        }
         System.out.println(min);
        
        
        
        
        
        
	}

}
