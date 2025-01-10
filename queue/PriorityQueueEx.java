package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		/*
		Underlying Data Structure	-> Priority heap (binary heap).
		Ordering					-> Elements are ordered based on their natural ordering or using a Comparator.
		Duplicates					-> Allowed.
		Null Values					-> Not allowed.
		Performance                 -> Offers logarithmic-time performance for adding and removing elements, constant time for retrieval.
		 
		*/
		
		PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparing(PriorityQueueEx::getPriority));
		
		pq.offer("Task 1 min");
		pq.offer("Task 2 max");
		pq.offer(null);
		pq.offer("Task 1 min");
		
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}
	
	public static int getPriority(String s) {
		if(s.contains("max")) {
			return 1;
		}else if(s.contains("norm")) {
			return 2;
		}else {
			return 3;
		}
	}
}
