package stringhandling;

import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {
	
	public static void main(String... programmingKT) {
		
		/*
		Problem : Find duplicate characters from given string using streams(java8)
		
		Input : Developer
		Output: e->3
		
		Input : programming
		Output: r->2 g->2 m->2
		 
		*/
		
		"streams"
		.chars()
		.mapToObj(i->(char)i)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()>1)
		.forEach(entry->System.out.println(entry.getKey() +" -> "+entry.getValue()));
		
	
	}
}
