package practiceday02;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		/*
		 * ask user to enter 2 int numbers then ask user to enter which operator they
		 * want to use if addition then print here is the sum of your operation 7 + 4=
		 * 11 Test data: Addition Subtraction Division Multiplication + - / *
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type 2 numbers!");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out
				.println("Please provide your operation as 'addition'/ 'subtraction' / 'division' or 'multiplication'");
		String operation = scan.next().toLowerCase();
		
		
		if(operation.equals("addition")) {
			 addition( n1, n2);
		}else if(operation.equals("subtraction")) {
			
			subtraction(n1,n2);
		}else if(operation.equals("division")) {
			division( n1,  n2);
		}else if(operation.equals("multiplication")) {
			
			multiplication(n1,n2);
			
		}else {
			System.out.println("You may have a wrong operation");
		}
	}
	public static void addition(int n1, int n2) {
		System.out.println("here is your operation: " + (n1 + n2));
	}
	public static void subtraction(int n1, int n2) {
		System.out.println("here is your operation: " + (n1 - n2));
	}
	
	public static void division(int n1, int n2) {
		System.out.println("here is your operation: " + (n1 / n2));
	}
	
	
	public static void multiplication(int n1, int n2) {
		System.out.println("here is your operation: " + (n1 * n2));
	}
	
	
}

/*
 * Scanner scan = new Scanner(System.in);
		
		String x=scan.nextLine();
		int result=0;
		int plus =x.indexOf("+");
		if(plus>-1) {
			result = Integer.parseInt(x.substring(0,plus)) +Integer.parseInt(x.substring(plus+1,x.length()));
		}
		
		System.out.println(result);*/



/*
 * Scanner scan = new Scanner(System.in);
        
        System.out.println("Enet 2 nums...");
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        System.out.println("Enter which operator you want...");
        
        String op = scan.next();
        
        
        if(op.contains("/")) {
            System.out.println(num1/num2);
        }
        if(op.contains("+")) {
            System.out.println(num1+num2);
        }
        if(op.contains("-")) {
            System.out.println(num1-num2);
        }
        if(op.contains("*")) {
            System.out.println(num1*num2);
 */


/*
 * Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers...");
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		int result = 0;
		
		System.out.println("Enter a aperation");
		
		String opr = scanner.next();
		
		if (opr.equals("+")) {
			result = firstNum + secondNum;
		}else if (opr.equals("-")) {
			result = firstNum - secondNum;
		}else if (opr.equals("/")) {
			result = firstNum / secondNum;
		}else {
			result = firstNum * secondNum;
		}
		System.out.println(result);
 */
 

/*Scanner scan =new Scanner(System.in);
		System.out.println("Enter first int");
		int num1= scan.nextInt();
		System.out.println("Enter second int");
		int num2= scan.nextInt();
		System.out.println("Enter operator");
		String op = scan.next();
		
		if(op.equalsIgnoreCase("/")){
			System.out.println(num1 / num2);
		}
		else if(op.equalsIgnoreCase("+")) {
			System.out.println(num1 + num2);
		}
		else if(op.equalsIgnoreCase("-")) {
			System.out.println(num1 - num2);
		}
		else if(op.equalsIgnoreCase("*")) {
			System.out.println(num1 * num2);
		}
 */

/*
Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scan.nextInt();
		System.out.println("Choose the operation: '+', '-', '*', '/'");
		String operation = scan.next().toLowerCase();
		
		switch(operation) {
		case "+":
		case "addition":
			System.out.println(num1+num2);
			break;
		case "-":
		case "subtraction":
			System.out.println(num1-num2);
			break;
		case "*":
		case "multiplication":
			System.out.println(num1*num2);
			break;
		case "/":
		case "division":
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("Enter only number");
		}*/


/*
 * Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();
    add = first + second;
    subtract = first - second;
    multiply = first * second;
    devide = (float) first / second;
    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + devide);
  }
}
 */
