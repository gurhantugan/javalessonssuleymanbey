package day17foreachloopmultidimensionalarray;

public class JavaPractice05 {

	public static void main(String[] args) {
		 // Print "Boom" if the digit 7 is displayed in an integer array
//	    int[] arr = {2, 729, 9};
//	    int counter=0;
//	    for (int i = 0; i < arr.length; i++) {
//	      int temp= arr[i];
//	      
//	      String temp_string= String.valueOf(temp);
//	      if(temp_string.contains("7")){
//	        System.out.println("Boom!! WE found 7");
//	        counter=1;
//	        break;
//	      }
//	    }
//	    if(counter==0){
//	    System.out.println("There is no 7 found");
//	  }	
		int counter =0;
		int[] arr1 = {2, 729, 9};
		for (int i=0;i<arr1.length;i++) {
			int num = arr1[i];
			
			String str1= String.valueOf(num);
			  if (str1.contains("7")) {
				  counter=1;
				  break;
			  } 
			  if (counter==0){System.out.println(" no 7 ");
			  
			  
			  }
		}
	   
	    
	    
	    
	    
	}

}
