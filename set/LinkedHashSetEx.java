package set;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetEx {
	
	public static void main(String... linkedHashSet) {
		/*
		1. Underlying Data Structure 	->	 LinkedList & Hash table.
		2. Duplicates					->	 Not allowed.
		3. Ordering						->	 Maintains the order of elements based on their insertion order. 
		4. Null Values					->	 Allows a single null value.
		5. Performance					->	 Offers constant-time performance for the basic operations (add, remove, contains).
		6. Thread Safety				->	 Not synchronized, not thread-safe.
		7. When to Use					->	 Use when you need a collection with unique elements and don't require ordering.
		8. Iterating					->	 Follows insertion order
		9. Time Complexity              ->   O(1)
		10.Performance Tip              ->   Generally faster than TreeSet due to constant-time performance.
		11.When to use                  ->   When you need a collection without duplicates and want to maintain the order of insertion. 
		12.Iteration                    ->   Iterates in the order of insertion or access. 
		*/
		
		// Q. How to Create a LinkedHashSet?
		Set<String> set = new LinkedHashSet<>();
		set.add("Java");
		set.add("Go");
		set.add(null);
		set.add(null);
		set.add(null);
		set.add("Go");
		set.addAll(List.of("Kotlin","Groovy","Julia"));
		set.add("Groovy");
		set.add(null);
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		// Q. How to Create a LinkedHashSet with Initial Capacity?
		Set<String> setTwo = new LinkedHashSet<>(45);
		Set<String> synchronizedSet = Collections.synchronizedSet(setTwo);
		// Q. How to Add Elements to aLinkedHashSet?
		setTwo.add("foo");
		// Q. How to Check if an Element Exists in a LinkedHashSet?
		set.contains("foo");
		// Q. How to Remove an Element from a LinkedHashSet?
		set.remove("Kotlin");
		// Q. How to Get the Size of a LinkedHashSet?
		set.size();
		// Q. How to Clear a LinkedHashSet?
		set.clear();
		// Q. How to Check if a LinkedHashSet is Empty?
		set.isEmpty();
		// Q. How to Remove All Elements from a LinkedHashSet?
		set.removeAll(Set.of("Java","Go"));
		
	}
}
