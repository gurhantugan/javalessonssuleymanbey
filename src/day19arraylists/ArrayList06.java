package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		
		//Create a method to delete odd elements and increase the even elements by multiplying 5
		
		List<Integer> list= new ArrayList<>();
		
		list.add(5);
		list.add(8);
		list.add(9);
		list.add(11);
		list.add(12);
		list.add(3);
		list.add(14);
		
		System.out.println(list);
		
		System.out.println(deleteOddsMultiplyEvensBy5(list));
		
	}

	// out of main method we have to create another method.
	
	public static List<Integer> deleteOddsMultiplyEvensBy5(List<Integer> list){
		
		for (int i=0; i<list.size(); i++) {
			
			if (list.get(i)%2==1) {
				
				list.remove(i);
				
				i--;			// if you dont use this index place will go one place back. but no check by if
				
			} else {
				
				list.set(i, list.get(i)*5);
				
			}
			
			
			
		}
		
		
		return list;
		
	}
	
	
	
	
}
