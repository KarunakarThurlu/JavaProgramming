package stringhandling;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepetingCharacter {

	public static void main(String... programmingKT) {
		"aabbcc"
		.chars()
		.mapToObj(i -> (char) i)	
		.collect(Collectors.groupingBy(
				                        Function.identity(), 
				                        LinkedHashMap::new,
				                        Collectors.counting()
				                        )
				)
		.entrySet()
		.stream()
		.filter(entry -> entry.getValue() == 1)
		.map(Map.Entry::getKey)
		.findFirst()
		.ifPresentOrElse((c) -> System.out.println(c), () -> System.out.println("Not Found"));
	}
}
