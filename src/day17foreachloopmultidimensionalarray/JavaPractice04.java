package day17foreachloopmultidimensionalarray;

import java.util.Arrays;

public class JavaPractice04 {

	public static void main(String[] args) {
		
		// Print "Boom" if the digit 7 is displayed in an integer array
	    int[] arr = {2, 6, 9, 89, 686, 1};
	    
	    int counter=0;
   
	    for (int i = 0; i < arr.length; i++) {
	      
	    	int temp= arr[i];
	      
	    	while(temp>0){
	    		
	    		if(temp%10==7){
	    			
	    			System.out.println("BOOM!! We found 7");
	        counter = 1;
	        break;
	    					}
	      temp = temp/10;
	      }
	    }
	    if(counter==0){
	    System.out.println("There is no 7 found");
	  }
		
	   
	   
	    
	    
	    
	    
	    //2.nd way:
	    
//	    int[] arr2 = {72, 6, 9, 89, 586, 1};
//	  String a= Arrays.toString(arr2);
//	  if(a.contains("7")) {
//		  System.out.println("BOOM!!!");
//	  } else {System.out.println("no 7 in the array");
//	  
//	  }
//	   
//	}

}
}
