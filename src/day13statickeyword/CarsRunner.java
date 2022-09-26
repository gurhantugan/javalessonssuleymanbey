package day13statickeyword;

public class CarsRunner {

	public static void main(String[] args) {
		
	// Using class name, we can access only static variables
		
		System.out.println(Cars.numOfCars);
		
		Cars c1 = new Cars();
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.vin);
		System.out.println(c1.year);
		
		// Using object name, we can access static variables but
		// it is not recomended
		
		System.out.println(c1.numOfCars);
	
		// Using class name, we can access static variables
		System.out.println(Cars.engine());
		
		// Using object name, we can access instance method.
		c1.drive(); // we do not need syso for console. it is under void method.
		
		// Using object name we can access static method
		// but it is not recommended
		
		c1.engine(); // we should use syso for console. it is under String method.
		
		Cars c2 = new Cars("Honda" ,"Civic", 2020 , 8500);
		String vinC2=Cars.createVin(c2);
		System.out.println(vinC2);
		
		
	}

}
