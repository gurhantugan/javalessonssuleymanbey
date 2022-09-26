package day12variabletypesmethodoverloadingconstructors;

public class VariablesTypes01Runner {

	public static void main(String[] args) {
		
		VariablesType01 obj1 = new VariablesType01();
       
		System.out.println(obj1);//Ali Can
        
       
		obj1.name = "Veli Han";
		obj1.isOld=true;
        
		
		System.out.println(obj1.name);//Veli Han
        
       
		System.out.println(obj1.id);//null Note: "id" has "yellow underline" because you created an object to access static variable
                                           //    no need to do it, because class name is enough to access
       
		obj1.id = "New Id";
        
		System.out.println(obj1.id);//New Id
        
       
		VariablesType01 obj2 = new VariablesType01();
        
		System.out.println(obj2.name);//Ali Can
        
        System.out.println(obj2.id);//New Id
        
        
		System.out.println(VariablesType01.add(6,7));
		
		

	}

}
