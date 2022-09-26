package day12variabletypesmethodoverloadingconstructors;

public class CarsRunner {

	public static void main(String[] args) {
		//Using class name, we can access only static variables
				System.out.println(Cars.numOfCars);
				
				
				Cars c1= new Cars();
				
				c1.make="Mercedes";
				c1.model="Benz";
				c1.price=12000;
				c1.year=2019;
				
				
				//Using object name, we can access instance variables
				
				System.out.println(c1.make);
				System.out.println(c1.model);
				System.out.println(c1.price);
				System.out.println(c1.vin);
				System.out.println(c1.year);
				
				//Using object name, we can access static variables
				//but it is not recommended
				System.out.println(Cars.numOfCars);
				
				//Using class name, we can access only static methods
				System.out.println(Cars.engine());
				
				//Using object name, we can access instance methods 
				c1.drive();
				
				//Using object name, we can access static methods
				//But it is not recommended
				System.out.println(c1.engine());
				
				Cars c2= new Cars("Honda", "Civic", 2010, 8500);
				System.out.println(c2.price);
				System.out.println(c2.model);
				System.out.println(c2.make);

				System.out.println(Cars.numOfCars);
				
		
				
				System.out.println(Cars.createVin(c2));
				
				
				Cars c3= new Cars("murat", "serce", 1980, 7500);
				System.out.println(Cars.numOfCars);
				
				System.out.println(Cars.createVin(c3));
				
	}
		
	}


