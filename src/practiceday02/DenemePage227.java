package practiceday02;

import java.util.ArrayList;
import java.util.List;

public class DenemePage227 {

	public static void main(String[] args) {
		
		int x =0 ;
		while (x++<10) {}
		String message = x>10 ?  "Greater than" : "false" ;

		System.out.println(message+ "," +x);
		
		
		List<Integer> list = new ArrayList<>();
		
	
		list.add(10);
		list.add(14);
		
		for (int x1: list) {
			System.out.print(x1 + ",");
		}
	}

}
