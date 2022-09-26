package day24abstractclass;

public abstract class Herbivores extends Animal{

	@Override
	public void eat() {
		System.out.println("Herbivores eat plants...");
		
	}
	
	 abstract void noMeat();
	

}
