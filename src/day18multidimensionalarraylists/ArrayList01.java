package day18multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {

		//disadvantage of Array is that the length must be declared at the beginning
		// and cant be changed. If the length is 100, you cant add 101st element or more than 100 elements
		//ArrayList 1) The length of ArrrayList is "flexible"
		//          2) ArrayList can store only non-primitive data-types
		
		//How to declare ArrayList
		//1st way
		ArrayList<Integer> list1= new ArrayList<>();
		
		//2nd way
		ArrayList<Integer> list2= new ArrayList<Integer>();
		
		//3rd way recommended
		List<Integer> list3= new ArrayList<>();
		System.out.println(list3);//[]
		
		//How to add elements
		//The order of elements is the order of insertion
		list3.add(8);
		list3.add(5);
		list3.add(3);
		System.out.println(list3);//[8, 5, 3]
		
		//How to add an element in a specific index
		list3.add(1,10);
		System.out.println(list3);//[8, 10, 5, 3]
		System.out.println(list3.add(20));//true
		System.out.println(list3);//[8, 10, 5, 3, 20]
		
		//How to get the length of list
		System.out.println(list3.size());//5
		
		
		
		
		
	}

}
