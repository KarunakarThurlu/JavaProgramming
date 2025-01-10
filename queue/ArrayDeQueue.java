package queue;

import java.util.ArrayDeque;

public class ArrayDeQueue {
	public static void main(String[] args) {
		/*
		Underlying Data Structure		->	 Resizable array.
		Ordering						->	 Maintains insertion order.
		Duplicates                      ->   Allowed.
		Null Values                     ->   Allowed.
		Performance                     ->   Constant-time performance for adding and removing elements.
		  
		 */
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.add(1);
		adq.add(6);
		adq.add(7);
		adq.add(2);
		adq.add(9);
		adq.add(3);
		
		adq.addFirst(10);
		adq.addLast(11);
		
		System.out.println(adq);
		
		adq.removeFirst();
		adq.removeLast();
		
		System.out.println(adq);
		
		adq.removeFirst();
		adq.removeLast();
		
		System.out.println(adq);
	}
}
