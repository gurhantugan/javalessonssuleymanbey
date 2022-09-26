package practice6;
import java.util.*;
public class ReplaceListElements {
	
	public static void main (String[] args) {
		//replace the elements that has value 1 to 8
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      list.add(1);
	      list.add(2);
	      list.add(7);
	      list.add(1);
	      list.add(3);
	      list.add(1);
	      
	    // we have a list as first parameter, then the element we wanted to change
	      // then the final element we wanted to replace
	      
	      Collections.replaceAll(list, 1, 8);
	      
	      System.out.println(list);
	}
}