package day22inheritance;

/*
 * Parent Child Classes Relations(Inheritance)
 * 1) Public class members can be used in child class
 * 2) Protected class members can be used in child class
 * 3) Default class members can be used in child class
 * Parent-Child classes must be in the same package
 * 4) Private class members can not be used in child class.
 * 5) Static class members should be accessed by child class name.
 * instead of using object name dog1.eat(); yerine Dog.eat(); daha mantikli
 	6) Java does not support multiple inheritance.
 	A class can have only one parent class.

 * 7) Super () is parent constructor call
 * 8) Super () must be in the first line in every constructor.
 * 9) this() must be in the first line as well,
 * 	we can not use this() and super() in the same constructor.
 */
		




public class Animal {
	
	public Animal() {
		
		System.out.println("Animal constructor...");
	}
	
		
	int age=5;
	
	public static void eat() {
		
		System.out.println("Animals eat........");
	}

	public void drink() {
		
		System.out.println("Animals drink");
		
	}
	
	
}
