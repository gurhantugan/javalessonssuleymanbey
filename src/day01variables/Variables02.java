package day01variables;

public class Variables02 {
	
	/* 
	 Data Type in Java
	 Note: In Java, there are two main data types.
	 
	 	1) Primitive Data Types: 
	 	a) boolean: It has 2 different values which are "true" or"false"
	 			    Every boolean memory uses a single "bit" in memory
	 			    booleans have "false" as a default value
	 	b) char: It is used for single characters. 
	 	   		Value must be put between single quotes like 'S'
	 	   		Every char uses 16 bits in the memory
	 	c) byte  
	 	d) short  
	 	e) int  
	 	f) long  
	 	g) float 
	 	h) double
	 	
	 	Note: "=" is used to assign value to a variable
	 		  "==" is used to compare two values whether they are equal to each other.	
	 	
	 	
	 	Note: If all values in an operations are integer the result will be an integer in Java
	 			If all the results are decimal in math, Java converts the decimal just by removing decimal part. No rounding operation.
	 	
	 	2) Non-Primitive Data Types
	 
	 	 */
			public static void main(String[] args) {
		
			boolean isExpensive = true;
			boolean isOld = false; 
			boolean isRetired;
			
			
			char initialOfFirstName = 'S';
			char initialOfLastName = 'A';
			
			System.out.println(initialOfFirstName); //S
			
			System.out.println(initialOfFirstName + 5);//?
			
			System.out.println(initialOfFirstName > 5);//true
			
			System.out.println(initialOfFirstName < 5);//false
			
			System.out.println(initialOfFirstName == 5);//false
			
			System.out.println(initialOfFirstName != 5);//true
		
			System.out.println(initialOfFirstName > initialOfLastName);//true
			
			System.out.println(initialOfFirstName + initialOfLastName);//SA or 148
			
			System.out.println(initialOfFirstName / initialOfLastName);//1
			
			System.out.println(29/10);//==>2
			
	}

}
