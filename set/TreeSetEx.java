package set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String... treeSet) {
		/*
		1. Underlying Data Structure 	->	 Red-Black Tree
		2. Duplicates					->	 Not allowed.
		3. Ordering						->	 Elements are stored in their natural order
		4. Null Values					->	 Cannot contain null if using natural ordering, because it requires elements to be comparable.
		5. Performance					->	 Offers constant-time performance for the basic operations (add, remove, contains).
		6. Thread Safety				->	 Not synchronized, not thread-safe.
		7. When to Use					->	 Use when you need a collection with unique elements and don't require ordering.
		8. Iterating					->	 Ascending order
		9. Time Complexity              ->   Offers log(n) time cost for basic operations (add, remove, contains)
		10.Performance Tip              ->   Generally faster than TreeSet due to constant-time performance.
		11.When to use                  ->   When you want a sorted set 
		12.Iteration                    ->   Iterates in the ascending order of elements. 
		*/
		
		// Q. How to Create a TreeSet?
		 Set<Character> set = new TreeSet<>();
		 Set<Character> synchronizedSet = Collections.synchronizedSet(set);
		 set.add('Z');
		 set.addAll(Set.of('B','C','K','O','D'));
		
		 System.out.println(set);
		// Q. How to Create a TreeSet with Initial Capacity?
		    //NO
		// Q. How to Add Elements to a TreeSet?
		// Q. How to Check if an Element Exists in a TreeSet?
		 set.contains('A');
		// Q. How to Remove an Element from a TreeSet?
		 set.remove('D');
		// Q. How to Get the Size of a TreeSet?
		 set.size();
		// Q. How to Clear a TreeSet?
		 set.clear();
		// Q. How to Check if a TreeSet is Empty?
		 set.isEmpty();
		// Q. How to Remove All Elements from a TreeSet?
		 set.removeAll(Set.of('C','K'));
	}
}
