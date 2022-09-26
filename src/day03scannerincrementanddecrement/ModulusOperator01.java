package day03scannerincrementanddecrement;

import java.util.Scanner;

public class ModulusOperator01 {

	public static void main(String[] args) {
		
		 //we use modulus operator if we want to get the remainder in division operation
        //the sign of modulus operator is %
        System.out.println(17%5);//2
        
        /*
         Ask user to enter two integer values; the first one will be greater than
         the second one.
        The width and the length of a rectangle are found as follows;
        The width is the remainder when the first number divided by the second number.
        The length is the sum of the two numbers.
        Calculate the area and the perimeter of the rectangle.
         */
        
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the first number= ");
        int num1 = scan1.nextInt();
        System.out.println("Enter the second number which is smaller than the first ");
        int num2 = scan1.nextInt();
        int width1 = num1%num2;
        int length1 = num1 + num2;
        
        System.out.println("The area of a rectangle = " + width1*length1 );
        
        
        
        
        
        
        
        
        
        
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first integer");
        int bigNum=scan.nextInt();
        System.out.println("Enter the second integer smaller than the first integer");
        int smallNum=scan.nextInt();
        //first be 5, second is 2
        int width= bigNum % smallNum;//1
        int length= bigNum + smallNum;//7
        
        System.out.println("The area: " + width*length);//7
        System.out.println("The perimeter: " + 2*(width+length));//16
		
		
		
		
	}

}
