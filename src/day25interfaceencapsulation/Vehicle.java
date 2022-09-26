package day25interfaceencapsulation;

public interface Vehicle {
	 int NUM=75;
	
	public default void move() {
		System.out.println("All vehicles should move...");
	}
	
	public static void staticMove() {
		System.out.println("All vehicles should move better...");
	}

}
