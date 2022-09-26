package day02variablesscanner;

public class Day02VariablesMemory {

	public static void main(String[] args) {
					
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
		 	c) byte: it is used for a "whole numbers" between -128 and 127 
		 	 		  It uses 8 bits from memory
		 	 		  if you are not sure the value between -128 and 127
		 	 		  do not use byte data type.
		 	d) short: It is used for "whole numbers" between -32768 and 32767
		 			  It uses 16 bits from the memory   
		 	
		 	
		 	e) int: It is used for whole numbers betwen -2,147,483,648 and  2,147,483,648
		 			it uses 32 bits from the memory
		 	f) long: It is used for whole numbers between -9,223,372,036,854,755,808 to 9,223,372,036,854,755,807
		 	  		  It uses 64 bits
		 	  		  every whole number is "int" for java as a default. When you create a "long" variable,
		 	  		  you have to put "L" at the end of a number to inform Java.
		 	g) float : It is used in "Decimal Numbers"
		 			   It uses 32 bits from memory
		 			   you can have 7 digits in decimal parts at most
		 	
		 	
		 	
		 	
		 	h) double: it is used for "Decimal Numbers"
		 				it uses 64 bits from memory
		 				you can have 16 digits in decimal parts at most
		 	Note: "=" is used to assign value to a variable
		 		  "==" is used to compare two values whether they are equal to each other.	
		 	
		 	
		 	Note: If all values in an operations are integer the result will be an integer in Java
		 			If all the results are decimal in math, Java converts the decimal just by removing decimal part. 
		 			No rounding operation.
		 	
		 	
		 	2) Non-Primitive Data Types
		 
		 		String: It is used for "Multiple Characters"
		 
		 Note: Stack memory is small and contains i) primitive data  
		 										 ii) Addresses the(references) of the non-primitive data
		 	 "Heap memory" is large memory and contains non-primitive data 
		 
		 Note: What is the difference between "primitive" and "non-primitive" data types?
		 		a) Primitive data type names are typed just by using lower cases, but non-primitive data types use
		 			upper case at the beginning.
		 		b) Primitive data types are just 8, but non-primitive data types are unlimited.
		 		c) Primitive data types were created by Java, we cannot create primitive data type.
		 			But non-primitive data types can be created by Java and by developers.
		 		d) Primitive data types are stored in "Stack Memory" and Non-Primitive data types are stored in 
		 		   "Heap Memory"
		 		****e) Primitive data types have just "values" in them.
		 			But non-primitive ones have "values" and "methods" in them.
		 		
		 	 */  

		byte age = 12;
		System.out.println("Age:" + age);
		
		short populationOfAVillage = 2000;
		System.out.println("Population: " + populationOfAVillage);//Population:2000
		
		int profit = 2000000000;
		System.out.println("The profit: $" + profit);// The profit: $2000000000
		
		long numberOfCellsInAHuman = 4536789654566789L;
		System.out.println("The number of cells in a human: " + numberOfCellsInAHuman);
		
		float f = 1.2F;
		System.out.println("The value :" + f);
		
		double d = 1.2;
		System.out.println("The value: " + d);
		
		
		String stdName = "Ali Can";
		System.out.println("Student name: " + stdName);
		
		System.out.println(stdName.toUpperCase());// ALI CAN
		System.out.println(stdName.toLowerCase());// ali can
		
		System.out.println(stdName.contains("i"));//true
		
		System.out.println(stdName.contains("x"));//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
