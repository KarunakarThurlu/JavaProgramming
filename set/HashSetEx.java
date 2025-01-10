package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String... hashSet) {
		/*
		1. Underlying Data Structure 	->	 Hash table.
		2. Duplicates					->	 Not allowed.
		3. Ordering						->	 Unordered, elements are not stored in any particular order.
		4. Null Values					->	 Allows a single null value.
		5. Performance					->	 Offers constant-time performance for the basic operations (add, remove, contains).
		6. Thread Safety				->	 Not synchronized, not thread-safe.
		7. When to Use					->	 Use when you need a collection with unique elements and don't require ordering.
		8. Iterating					->	 Iteration order is not guaranteed, may vary from one run to another.
		9. Time Complexity              ->   Offers constant time performance O(1) for basic operations (add, remove, contains)
		10.Performance Tip              ->   Generally faster than TreeSet due to constant-time performance.
		11.When to use                  ->   When you just need a collection without duplicates and don't care about order.
		12.Iteration                    ->   Iteration order is unpredictable. 
		*/
		
		//Q. How to Create a HashSet?
		Set<Integer> set= new HashSet<>();
		//Q. How to Create a HashSet with Initial Capacity?
		Set<Integer> setTwo= new HashSet<>(26);
		//Q. How to Add Elements to a HashSet?
		set.add(12);
		set.addAll(Set.of(2,6,7,9));
		System.out.println(set);
		set.add(null);
		set.add(null);
		set.add(null);
		System.out.println(set);
		//Q. How to Check if an Element Exists in a HashSet?
		System.out.println(set.contains(99));
		
		//Q. How to Remove an Element from a HashSet?
		System.out.println(set);
		set.remove(7);
		System.out.println(set);
		
		//Q. How to Get the Size of a HashSet?
		System.out.println(set.size());
		//Q. How to Clear a HashSet?
		//set.clear();
		//Q. How to Check if a HashSet is Empty?
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		//Q. How to Remove All Elements from a HashSet?
		System.out.println(set);
		set.removeAll(Set.of(6,2,9));
		System.out.println(set);
	}
}
