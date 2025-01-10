package collectionsutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class IteratorVsListIterator {
	
	public static void main(String... iteratorVsListIterator) {
		/*
		 
		--------------------------------------------------------------------------------------------------------------
		Iterator                                        Vs                           ListIterator
		--------------------------------------------------------------------------------------------------------------
		1.Iterator is an interface (since 1.2  )          	    1. ListIterator is an interface(Since 1.2)
		2.It can be applied to any collection interface.		2. It can be applied to the only list interface.
		3.Accessing elements Single direction					3. Accessing elements Bidirectional
		4.We can perform read and remove operation.				4. We can perform read, remove, add, and replace operations.
		5.How can we get it?  By calling iterator() 			5. By calling listIterator() method present in the list interface.
		6.Frequently used methods hasNext(),next(),remove()  	6. Frequently used methods hasNext() , next() ,hasPrevious(), previous(), remove(),set(E e) 
		*/
		
		Set<Integer> l = new HashSet<>();
		l.add(1);
		l.addAll(Arrays.asList(2,5,7,9,3,5,6,7,5,9,7));
		
		Iterator<Integer> iterator = l.iterator();
		
		System.out.println(l);
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			if(next==7) {
				iterator.remove();
			}
		}
		System.out.println(l);
		
		List<String> list= new ArrayList<>();
		list.add("CoreJava");
		list.addAll(Arrays.asList("JDBC","Spring","SpringBoot"));
		
		
		ListIterator<String> listIterator = list.listIterator();
		
		System.out.println(list);
		while(listIterator.hasNext()) {
			String next = listIterator.next();
			if(next.equals("JDBC")) {
				listIterator.remove();
			}
		}
		System.out.println("---------------------");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		/*
		--------------------------------------------------------------------------------------------------------------
		Comparable                                        Vs                           Comparator
		--------------------------------------------------------------------------------------------------------------
		1.Comparable is an interface (since 1.2  )          		1. Comparator is an interface(Since 1.2)
		2.Default Natural sorting order.							2. Custom Sorting order.
		3.from java.lang											3. from java.util 
		4.compareTo()												4. compare()
		*/
	}
}
