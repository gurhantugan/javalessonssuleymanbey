package practice4;
public class FamilyRunner {
	
	
	public static void main(String[] args) {
		
		                             //
		ReportCard  report = new ReportCard(9, 9, 10,10);
		
		
		
		Student student = new Student("Ali", "Can",16, report );
		
		
		Parent parent = new Parent("Veli","Can", student.total() >= 35, student);
		
		
		
//		System.out.println(parent);
//		System.out.println("Parent status: "+parent.successMessage());
//		System.out.println("Child status: "+student.successMessage());
		
		
		
		System.out.println(parent);
		
		
		
		
		
		
	}
}
