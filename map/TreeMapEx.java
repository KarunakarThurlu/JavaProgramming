package map;

import java.util.TreeMap;

public class TreeMapEx {
	
	public static void main(String... treeMap) {
	/*
		Underlying Data Structure	: Red-black tree.
		Null Values					: Does not allow null keys; allows multiple null values.
		Ordering					: Maintains natural ordering of keys or ordering specified by a comparator during construction.
		Duplicate Keys				: Does not allow duplicate keys; if a duplicate key is added, the old value associated with that key is replaced.
		Thread Safety				: Not thread-safe; must be synchronized externally if used in a concurrent environment.
		Performance					: Logarithmic-time performance for most operations
		Iterating					: The keys are ordered either in natural order or as specified by the comparator.
		Fail-Fast Iterator			: Iterator may throw a ConcurrentModificationException if the map is structurally modified during iteration.
		Example Use Cases			: Maintaining a sorted mapping of keys.
	 */
		TreeMap<Integer, String> tmap=new TreeMap<>();
		tmap.put(90, "Java");
		tmap.put(80, "JavaEE");
		tmap.put(40, "CoreJava");
		tmap.put(190, "Spring");
		tmap.put(100, "SpringBoot");
		tmap.put(120, "JPA");
		tmap.put(96, "JDBC");
		tmap.put(96, "JSP");
		
		tmap.entrySet().forEach(e->System.out.println(e.getKey()+","+e.getValue()+" "));
		
	}
}
