package practice6;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortKeySetsOfMap {
	
	public static void main(String[] args) {
		/*
		 * "a"  "One"
		 * "b"  "Two"
		 * "d"  "Four"
		 * "c"  "Three"
		 * Sort the elements using Map
		 */
		
		Map<String, String> hm= new HashMap<>();
		
		hm.put("b" , "Two");
		hm.put("d"  ,"Four");
		hm.put("c"  , "Three");
		hm.put("a" , "One");
		System.out.println(hm);
		
		
		
		SortedMap map= new TreeMap<>();
		map.put("a" , "One");
		map.put("b" , "Two");
		map.put("d" ,"Four");
		map.put("c" , "Three");
		
		System.out.println(map);
	}
}