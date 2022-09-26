package practicedaygurhanpage224;

public class Mammal extends Animal {

	protected int num3 = 12;
	public String name2 = "Veli";
	private int num4 = 13;
	
	public Mammal() {
		
		System.out.println(this.num1);			//10
		System.out.println(super.num1);			//10
		
		System.out.println(this.getNum2());	    //11
		System.out.println(super.getNum2());	//11
		
		this.setNum2(23);
		System.out.println(this.getNum2());		//23
		System.out.println(super.getNum2());	//23
		
		super.setNum2(33);
		System.out.println(this.getNum2());		//33
		System.out.println(super.getNum2());	//33
		
		
		System.out.println(this.num3);			//12
		System.out.println(this.num4);			//13
		
		System.out.println(this.name);			//Ali
		System.out.println(super.name);			//Ali
		
		System.out.println(this.name2);			//Veli
	}
		
		public static void main(String[] args) {
			Mammal mammal = new Mammal();

		}
	
	
	
}
