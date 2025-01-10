package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	@SuppressWarnings("removal")
	public static void main(String... arrayList) {

		/*
		 * 
		 * ArrayList:- 
		 * ----------- 
		 * 1). Underlying DataStructure 	 -> Dynamic Array. 
		 * 2). Default initial Capacity 	 -> 10. 
		 * 3). Duplicate elements       	 -> Allowed. 
		 * 4). null values 					 -> Allowed
		 * 5). Follow Insertion Order  	     -> Yes
		 * 6). Is it thread safe.            -> No
		 * 7). When to use                   -> Use when frequent access and traversal of elements are required.
		 * 8). Resizing Mechanism            -> When the number of elements exceeds the capacity
		 * 9). Time Complexity for access    -> O(1)
		 * 10).Time Complexity for Insertion -> O(n)
		 * 11).Time Complexity for deletion  -> O(n)
		 * 12).Memory Overhead               -> Requires additional memory to store the unused capacity of the array.
		 */
		
		
		//Q. How to create an ArrayList?
		
		List<Integer> l =new ArrayList<>();
		
		//Q. How to add elements to an ArrayList?
		
		l.add(10);
		l.add(null);
		l.addAll(Arrays.asList(20,30,40,10));
		l.add(null);
		//Q. How to access elements from an ArrayList?
		System.out.println(l);
		
		System.out.println(l.get(6));
		
		System.out.println("------Iterator------");
		Iterator<Integer> iterator = l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------for loop------");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("------forEach method------");
		
		l.forEach(e->System.out.println(e));
		
		//Q. How to remove elements from an ArrayList?
		System.out.println(l);
		//l.remove(6);
		System.out.println(l);
		
		//Q. How to check if an ArrayList contains a specific element?
		
		boolean contains = l.contains(10);
		System.out.println(contains);
		
		//Q. How to get the size of an ArrayList?
		
		System.out.println(l.size());
		//Q. How to iterate through an ArrayList?
		System.out.println("------Iterator------");
		Iterator<Integer> iteratorTwo = l.iterator();
		while(iteratorTwo.hasNext()) {
			System.out.println(iteratorTwo.next());
		}
		
		//Q. How to clear all elements from an ArrayList?
		System.out.println("------clearing------");
		System.out.println(l.size());
		l.clear();
		System.out.println(l.size());
		
		//Q. How to check if an ArrayList is empty?
		System.out.println(l.isEmpty());
		
		//Q. How to convert an ArrayList to an array?
		Object[] array = l.toArray();
		Integer[] array2 = l.toArray(Integer[]::new);
;		
		
	}
}
