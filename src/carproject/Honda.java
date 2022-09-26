package carproject;

public class Honda extends Car {

	String make="Honda";
	String model="Accord";
	int year=2012;
	double price=8000;
	
	
	static {
		System.out.println("honda is on the way");
	}
	
	public Honda() {
		// super();  no need
	}
	
	
	public Honda(String model, int year, double price) {
		super(model, year, price);
		this.model = model;
		this.year = year;
		this.price = price;
	}
// i did not create constructor about honda. it is always honda.

	@Override
	String carMake() {
		
		return "Car make : "+this.make;
	}
	@Override
	String carModel() {
	
		return "Car model: "+this.model;
	}
	@Override
	int carYear() {
		
		return this.year;
	}
	@Override
	double carPrice() {
		
		return this.price;
	}
	
	
	
	
}
