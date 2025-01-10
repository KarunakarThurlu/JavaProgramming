package set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetEx {
	
	public static void main(String... naviagableSet) {
		
		//NavigableSet:- NavigableSet interface is sub type of SortedSet interface
		
		/*
		 --------------------------
		  Methods in NaviagableSet
		 --------------------------
		*/
		
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(10);
		ns.add(34);
		ns.add(50);
		ns.add(34);
		ns.add(18);
		ns.add(39);
		ns.add(38);
		ns.add(20);
		ns.add(55);
		System.out.println(ns);
		
		
		//1. lower(E e)  	-> Returns the greatest element in this set strictly less than given element, or null
		System.out.println(ns.lower(39));
		
		//2. floor(E e)  	-> Returns the greatest element in this set less than or equal to the given element, or null
		System.out.println(ns.floor(39));
		
		//3. ceiling(E e) 	-> Returns the least element in this set greater than or equal to the given element, or null
		System.out.println(ns.ceiling(50));
		
		//4. higher(E e)    -> Returns the least element in this set strictly greater than the given element, or null
		System.out.println(ns.higher(50));
		
		//5. pollFirst()    -> Retrieves and removes the first (lowest) element or null
		System.out.println("-----------------------------------------");
		System.out.println(ns);
		System.out.println(ns.pollFirst());
		System.out.println(ns);
		
		//6. pollLast()     -> Retrieves and removes the last (highest) element or null
		System.out.println("-----------------------------------------");
		System.out.println(ns);
		System.out.println(ns.pollLast());
		System.out.println(ns);
		
		
		
	}
}
