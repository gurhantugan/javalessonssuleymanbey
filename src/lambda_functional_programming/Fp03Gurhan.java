package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Fp03Gurhan {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
         
        printInUpperCases01(l);
        System.out.println();
        printInUpperCases02(l);
        System.out.println();
        printElementsSortedByLength(l);
	}
	//1) Create a method to print all list elements in uppercase
    
	public static void printInUpperCases01(List<String> list) {		
		list.stream().map(String::toUpperCase).forEach(UtilsDt::printInTheSameLineWithSpace);		
	}
	
	public static void printInUpperCases02(List<String> list) {				
		list.replaceAll(String::toUpperCase);			
	System.out.println(list);
	}
	
	//2) Create a method to print the elements after ordering according to their lengths
		public static void printElementsSortedByLength(List<String> list) {
			
			list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsDt::printInTheSameLineWithSpace);
		}
	
	
	
	
	
}
