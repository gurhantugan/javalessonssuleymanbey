package day13statickeyword;
//Type code to count the number objects created from Students class
public class Students {

	public String name;
	public int age;
	public static int numOfStudents;
	public String studentId;
	
	public Students() {
		this.name= "Ali Can";
		this.age = 10;
		numOfStudents++;
		this.studentId=name.substring(0, 2) + age + numOfStudents;
		}
	
	public Students(String name,int age ) {
		this.name= name;
		this.age = age;
		this.studentId=name.substring(0, 2) + age + numOfStudents;
		numOfStudents++;
		}
	
	public Students(String name) {
		this.name= name;
		this.studentId=name.substring(0, 2) + age + numOfStudents;
		numOfStudents++;
		}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Before std1 created :" +numOfStudents);
		Students std1 = new Students();
		System.out.println("After std1 created :" +numOfStudents);
		System.out.println(std1.studentId);
		
		Students std2 = new Students();
		System.out.println("After std1, std2 created :" +numOfStudents);
		System.out.println(std2.studentId);
		
		Students std3 = new Students("Veli Han",12);
		System.out.println("After std1, std2, std3 created :" +numOfStudents);
		System.out.println(std3.studentId);
		
		Students std4 = new Students("Mehmet");
		System.out.println("After std4 created :" +numOfStudents);
		System.out.println(std4.studentId);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
