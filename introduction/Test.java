package introduction;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String... programingKT) {
		var map = Map.of("Java", 85,"Rust", 79,"Go", 83,"Kotlin", 70,"Groovy", 60);
		Map<String, Integer> sortedByValues = sortingByValues(map);
		System.out.println(sortedByValues);
	}

	public static Map<String, Integer> sortingByValues(Map<String, Integer> map) {
		return map.entrySet()
				.stream()
			    .sorted(Map.Entry.comparingByValue())
			    .collect(Collectors.toMap(Map.Entry::getKey, 
			    						  Map.Entry::getValue, 
			    						 (e1, e2) -> e1, LinkedHashMap::new)
			    		);
	}
}


/*
 * A. [1, 2, 3, 4, 5] B. [5, 4] C. [4, 5] D. [5, 4, 3]
 */

//https://www.w3resource.com/java-exercises/collection/array-list.php

