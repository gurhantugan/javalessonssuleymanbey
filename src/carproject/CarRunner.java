package carproject;

public class CarRunner {

	public static void main(String[] args) {
		
		System.out.println("=======CAR1==========");
		
		Car car1= new Honda();
		System.out.println(car1.model);		//NULL. Because I should go to Car Class. not Honda class.
											// data type=reference type
											// we call car1.model from data type or reference type
											//it is not method. we do not call from constructor
		
		// now we go to Honda class. we call constructor. because we call method.
		System.out.println(car1.carMake());	//Car make : Honda
		System.out.println(car1.carModel()); //Car model: Accord
		System.out.println(car1.carYear());	//2012
		System.out.println(car1.carPrice());//8000.0
		
		
		
System.out.println("=======CAR2==========");
		
		Car car2= new Honda("Civic", 2020, 20000);

		System.out.println(car2.model);// civic. it was null in car1 object
		
		System.out.println(car2.carMake());
		System.out.println(car2.carModel());
		System.out.println(car2.carYear());
		System.out.println(car2.carPrice());
		
		
System.out.println("=======CAR3==========");
		
		Car car3= new Toyota();	
		System.out.println(car3.carMake());
		System.out.println(car3.carModel());
		System.out.println(car3.carYear());
		System.out.println(car3.carPrice());
		System.out.println(car3.model); // not updated, null
		
		
		
		
		
		
		
		
		
		
		
	}

}
