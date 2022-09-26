package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class FpDt02 {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        
        
        printElementsFunctional(l);

	}
	//1)Create a method to print the list elements on the console in the same line with a space 
		//  between two consecutive elements.(Functional)
		public static void printElementsFunctional(List<Integer> list) {
			
			list.stream().forEach(System.out::print);
		}
}
