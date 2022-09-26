package day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		// How to check if a collection of given elements exist in a list
		//["A", "M", "C", "K", "B"] ==> Check if "A", and "C", and "K" exist in the list
		
		
		List<String> list1= new ArrayList<>();
		
		list1.add("A");
		list1.add("M");
		list1.add("C");
		list1.add("K");
		list1.add("B");
		System.out.println(list1); //[A, M, C, K, B]
	
		
		// We create new list
		
		
		List<String> list2= new ArrayList<>();
		list2.add("A");
		list2.add("C");
		list2.add("K");
		
		System.out.println(list2);
		
		// containsAll() method to check if a list contains another list
		
		System.out.println(list1.containsAll(list2)); //true
		
		
		//2nd method; asList method
		//(containsAll(Arrays.asList()) method
		
		
		System.out.println(list1.containsAll(Arrays.asList("A","C","K")));//true
		
		
		// If we use asList() method, be careful, the length will not be changed.
		List<Integer> list3 = Arrays.asList(3,4,6,8);
		list3.add(9);
		
		System.out.println(list3);  //Exception in thread "main" java.lang.UnsupportedOperationException
		
		list3.remove(0);
		System.out.println(list3);  //Exception in thread "main" java.lang.UnsupportedOperationException
		
		
		// remove "C" 
		
		
		System.out.println(list1); //[A, M, C, K, B]
		//remove "C", and write "D" instead of it
		
		
		
		//1st way
		int idxOfC = list1.indexOf("C");
		
		list1.remove(idxOfC);
		
		list1.add(idxOfC, "D");
		
		System.out.println(list1);
		
		
		// 2nd way (set() method);
		// we use it to write a specific element at a specific index
		
		list1.set(idxOfC, "D");
		
		
		
		
		
		
		

	}

}
