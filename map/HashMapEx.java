package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String... hashMap) {
		
		/*
		Underlying Data Structure	: Hash table.
		Null Values					: Allows one null key and multiple null values.
		Ordering					: Does not guarantee any specific order of elements.
		Duplicate Keys				: Does not allow duplicate keys; if a duplicate key is added, the old value associated with that key is replaced.
		Thread Safety				: Not thread-safe; must be synchronized externally if used in a concurrent environment.
		Performance					: Generally provides constant-time performance for basic operations (get, put, remove) under the assumption of uniform hashing.
		Iterating					: The order of iteration is not guaranteed to be the same as the order of insertion.
		Fail-Fast Iterator			: Iterator may throw a ConcurrentModificationException if the map is structurally modified during iteration.
		Example Use Cases			: Caching, where fast access to data is required.
		*/
		
		
		// Q. How to Create a HashMap?
		Map<String, Integer> m = new HashMap<>();
		
		// Q. How to Create a HashMap with Initial Capacity?
		Map<String, Integer> m1 = new HashMap<>(36);
	
		// Q. How to Add Elements to a HashMap?
		m.put("Varun", 5432);
		m.put("Tarun", 5462);
		m.put("Karun", 5459);
		m.put("Naveen", 5440);
		m.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
//		m.put(null, 5441);
//		m.put(null, 5442);
		//m.putAll(Map.of("Karun", 5434,"Meanon",5439));
		
//		System.out.println(m);
//		// Q. How to Check if an Element Exists in a HashMap?
//		if(m.containsKey("Jeevan")) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
//		// Q. How to Remove an Element from a HashMap?
//		System.out.println(m);
//		m.remove("Meanon");
//		System.out.println(m);
//		// Q. How to Get the Size of a HashMap?
//        System.out.println(m.size());
//        
//        // Q How to access Elements from Map
//        for(Entry<String, Integer> e:m.entrySet()) {
//        	System.out.println(e.getKey()+ " "+e.getValue());
//        	//m.put("Jathin", 54321);
//        }
//        System.out.println("---------------------");
//        m.entrySet().stream().forEach(e->System.out.println(e.getKey()+ " "+e.getValue()));
//		// Q. How to Clear a HashMap?
//        m.clear();
//        System.out.println(m.size());
//
//		// Q. How to Check if a HashMap is Empty?
//        System.out.println(m.isEmpty());
//
//		// Q. How to Remove All Elements from a HashMap?
//		
//		// Q. How to get UnModifiable HashMap?
//        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(m);

       
	}
}
