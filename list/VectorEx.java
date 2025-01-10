package list;

import java.util.Vector;

public class VectorEx {
	public static void main(String... vector) {
		
		/*
		 * 
		 * Vector:- 
		 * ----------- 
		 * 1). Underlying DataStructure 	 -> Dynamic Array. 
		 * 2). Default initial Capacity 	 -> 10. 
		 * 3). Duplicate elements       	 -> Allowed. 
		 * 4). null values 					 -> Allowed
		 * 5). Follow Insertion Order  	     -> Yes
		 * 6). Is it thread safe.            -> Yes (Synchronized)
		 * 7). When to use                   -> Use when thread safety is required, or when elements need to be accessed and modified by multiple threads.
		 * 8). Resizing Mechanism            -> Similar to ArrayList, Vector dynamically resizes its underlying array
		 * 9). Time Complexity for access    -> O(1) with additional overhead due to synchronization.
		 * 10).Time Complexity for Insertion -> O(n) with additional overhead due to synchronization.
		 * 11).Time Complexity for deletion  -> O(n) with additional overhead due to synchronization.
		 * 12).Memory Overhead               -> Requires additional memory to store the unused capacity of the array.
		 */

		// previous and next nodes.

		// Q. How to create Vector?
		Vector<Integer> v=new Vector<>();

		// Q. How to add elements to Vector?
		v.add(1);

		// Q. How to access elements from Vector?

		// Q. How to remove elements from Vector?
		v.remove(0);

		// Q. How to check if Vector? contains a specific element?

		// Q. How to get the size of Vector?

		// Q. How to iterate through Vector?

		// Q. How to clear all elements from Vector?

		// Q. How to check if Vector? is empty?
		v.isEmpty();

		// Q. How to convert Vector? to an array?
		v.toArray();
		

	}
}
