package day22inheritance;

public class Runner {

	public static void main(String[] args) {
		
		
		Dog dog1 = new Dog();
		
		System.out.println(dog1.age);
		
		dog1.eat();// sari underline stTIC VOID OLDUGU icin animal classta eat metodu icin
		
		Dog.eat(); // sari underline yok
		System.out.println(dog1);
		
		dog1.giveBirth();
		
		dog1.feedMilk();
		
		dog1.bark();
		
		dog1.equals(dog1);// object class is the parent class of all other class
		
		
		

	}

}
