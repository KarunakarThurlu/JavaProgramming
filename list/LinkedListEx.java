package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String... linkedList) {

		// LinkedList:-
		// -----------
		// 1). Underlying DataStructure 		-> Doubly-linked list
		// 2). Default initial Capacity 		-> N/A (No fixed capacity)
		// 3). Duplicate elements 				-> Allowed.
		// 4). null values 						-> Allowed
		// 5). Follow Insertion Order 			-> Yes
		// 6). Is it thread safe. 				-> No
		// 7). When to use 						-> Use when frequent insertion and deletion operations are required.
		// 8). Resizing Mechanism 				-> N/A
		// 9). Time Complexity for access 		-> O(n)
		// 10).Time Complexity for Insertion	-> O(1)
		// 11).Time Complexity for deletion 	-> O(1)
		// 12).Memory Overhead 			    	-> Requires additional memory to store references to the previous and next nodes.

		// Q. How to create an LinkedList?
		List<String> ll =new LinkedList<>();

		// Q. How to add elements to an LinkedList?
		ll.add("Java");
		ll.addAll(List.of("Kotling","Go"));
		System.out.println(ll);

		// Q. How to access elements from an LinkedList?
		
		ll.get(0);

		// Q. How to remove elements from an LinkedList?
		ll.remove(0);

		// Q. How to check if an LinkedList? contains a specific element?
		
		ll.contains("foo");

		// Q. How to get the size of an LinkedList?

		// Q. How to iterate through an LinkedList?

		// Q. How to clear all elements from an LinkedList?

		// Q. How to check if an LinkedList? is empty?

		// Q. How to convert an LinkedList? to an array?
		
	}
}
