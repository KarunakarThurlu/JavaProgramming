package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		/*
			Underlying Data Structure	->	Doubly-linked list.
			Ordering					->	Maintains insertion order.
			Duplicates					->	Allowed.
			Null Values					->	Allowed.
			Performance					->	Offers constant-time performance for adding and removing elements. O(1)
		 */
		
		Queue<String> q = new LinkedList<>();
		
		q.offer("Java");
		q.offer("Java");
		q.offer("Spring");
		q.offer("SpringBoot");
		System.out.println(q);
		System.out.println(q.size());
		String poll = q.peek();
		System.out.println(poll);
		System.out.println(q.size());
	
	}
}
