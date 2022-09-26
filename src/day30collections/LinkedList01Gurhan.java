package day30collections;

import java.util.LinkedList;

public class LinkedList01Gurhan {

	public static void main(String[] args) {
		
		LinkedList<String> ll1= new LinkedList<>();
		
		System.out.println(ll1);
		
		ll1.add("Yusuf");
		ll1.add("Murat");
		ll1.add("Onler");
		ll1.add("Gurhan");
		ll1.add("Tugan");
		
		System.out.println(ll1);
		
		
		System.out.println(ll1.getFirst());
		
		String firstElement = ll1.getFirst();
		System.out.println(firstElement);
		
		String firstElement2= ll1.element();
		System.out.println(ll1.element());
		System.out.println(firstElement2);
		
		String firstElement3= ll1.peek();

		System.out.println(firstElement3);
		
		String firstElement4= ll1.poll();
		
		System.out.println(firstElement4);
		
		System.out.println(ll1);
		
		
		//How to get first element from an empty linked list
				LinkedList<String> ll2= new LinkedList<>();//empty linked list
				System.out.println(ll2);
				
//				System.out.println(ll2.getFirst());
//				System.out.println(ll2.element());
				System.out.println(ll2.peek());
				System.out.println(ll2.poll());
				
				
				
				
		
	}

}
