package map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
	
	public static void main(String... linkedHashMap) {
	/*
	Underlying Data Structure	: Combination of hash table and linked list.
	Null Values					: Allows one null key and multiple null values.
	Ordering					: Maintains insertion order of elements
	Duplicate Keys				: Does not allow duplicate keys; if a duplicate key is added, the old value associated with that key is replaced.
	Thread Safety				: Not thread-safe; must be synchronized externally if used in a concurrent environment.
	Performance					: Slower than HashMap due to the additional overhead of maintaining linked list for ordering.
	Iterating					: The order of iteration is guaranteed to be the same as the order of insertion or access, depending on the constructor used.
	Fail-Fast Iterator			: Iterator may throw a ConcurrentModificationException if the map is structurally modified during iteration.
	Example Use Cases			: Maintaining a LRU cache with predictable iteration order.
	 */
	
	LinkedHashMap<String,Integer> lmap=new LinkedHashMap<>();
	lmap.put("Java", 12);
	lmap.put("JDBC", 11);
	lmap.put("Spring", 15);
	lmap.put("SpringBoot", 9);
	lmap.put("JavaEE", 2);
	lmap.put("JPA", 3);
	lmap.put("JPA", 90);
	
	lmap.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
	
	}
}
