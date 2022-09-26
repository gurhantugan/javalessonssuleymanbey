package day24abstractclass;

public class RunnerAnimals {

	public static void main(String[] args) {
	
		Dog dog1= new Dog();
		dog1.drink();
		dog1.eat();
		
		
		Cow cow1= new Cow();
		cow1.noMeat();
		cow1.drink();
		cow1.eat();
		
		Bird bird1 =new Bird();
		bird1.eat();
		bird1.drink();
		
		Fish fish1 = new Fish();
		fish1.eat();
		
		Sheep shp1 =new Sheep();
		shp1.eat();
		shp1.noMeat();
		
		

	}

}
