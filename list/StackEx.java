package list;

import java.util.Stack;

public class StackEx {
	
	public static void main(String... stack) {
		
		/*
		 * 
		 * Stack:- 
		 * ----------- 
		 * 1). Underlying DataStructure 	 -> Dynamic Array. 
		 * 2). Default initial Capacity 	 -> 10. 
		 * 3). Duplicate elements       	 -> Allowed. 
		 * 4). null values 					 -> Allowed
		 * 5). Follow Insertion Order  	     -> Yes (LIFO)
		 * 6). Is it thread safe.            -> Yes (Synchronized)
		 * 7). When to use                   -> Use when Last In First Out (LIFO) behavior is required.
		 * 8). Resizing Mechanism            -> Similar to ArrayList and Vector, Stack dynamically resizes its underlying array 
		 * 9). Time Complexity for access    -> O(1) Peek
		 * 10).Time Complexity for Insertion -> O(1) Push
		 * 11).Time Complexity for deletion  -> O(1) Pop
		 * 12).Memory Overhead               -> Similar to Vector, Stack incurs additional memory overhead due to synchronization. 
		 */
		
	
		
		//Q. How to create an Stack?
		
		Stack<Character> s=new Stack<>();
		
		//Q. How to add elements to Stack?
		s.push('A');
		s.push('B');
		s.push('C');
		
		//Q. How to access elements from Stack?
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.size());
		
		//Q. How to remove elements from Stack?
		
		//Q. How to check if Stack contains a specific element?
		s.contains('C');
		
		//Q. How to get the size of Stack?
		
		//Q. How to iterate through Stack?
		
		//Q. How to clear all elements from Stack?
		
		//Q. How to check if Stack is empty?
		
		//Q. How to convert Stack to an array?
		
		
		
		
	}
}
