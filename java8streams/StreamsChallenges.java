package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsChallenges {

	public static void main(String[] args) {
		System.out.println(productOfAllElements());
	}
	
	public static Map<Integer, List<String>> groupByValues(Map<String, Integer> map) {
		return map.entrySet()
				  .stream()
				  .collect(
						Collectors.groupingBy(
								  	Map.Entry::getValue, 
								  	Collectors.mapping(Map.Entry::getKey, 
								  					  Collectors.toList()
								  					  )
								    )
						 );
	}
	public static Map<Boolean, Set<Integer>> partitionEvenOdds(Set<Integer> set) {
		return set.stream()
	       .collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.toSet()));
	}
	public static Set<Integer> findCommonElements(Set<Integer> s1, Set<Integer> s2) {
		return s1.stream()
		         .filter(s2::contains)
		         .collect(Collectors.toSet());
	}
	public static Set<Integer> findSymmetricDifference(Set<Integer> s1, Set<Integer> s2) {
		return Stream.concat(s1.stream().filter(e -> !s2.contains(e)),
							 s2.stream().filter(e -> !s1.contains(e)))
				     .collect(Collectors.toSet());
	}
	
	public static List<List<Integer>> splitIntoSubLists(List<Integer> list, int k) {
		// Calculate the base size and remainder
		int baseSize = list.size() / k;
		int remainder = list.size() % k;

		// Use a stream to partition the list into K sublists
		List<List<Integer>> result = new ArrayList<>();
		int start = 0;

		for (int i = 0; i < k; i++) {
			int sublistSize = baseSize + (i < remainder ? 1 : 0);
			var sublist = list.stream()
					          .skip(start)
					          .limit(sublistSize)
					          .collect(Collectors.toList());
			result.add(sublist);
			start += sublistSize;
		}
		return result;
	}
	
	public static List<Integer> removeConsecutiveDuplicates(List<Integer> list) {
		return IntStream.range(0, list.size())
	            .filter(i -> i == 0 || !list.get(i).equals(list.get(i - 1)))
	            .mapToObj(list::get)
	            .collect(Collectors.toCollection(ArrayList::new));
	}
	
	public static List<Integer> reverseGroupOfElements(List<Integer> list, int k) {
		return IntStream
				// Divide the list into chunks of K
				.range(0, (list.size() + k - 1) / k)
				// Get each sublist
				.mapToObj(i -> list.subList(i * k, Math.min((i + 1) * k, list.size())))
				.flatMap(sublist -> {
					List<Integer> temp = new ArrayList<>(sublist);
					// Reverse every sublist, even if less than K
					Collections.reverse(temp);
					return temp.stream();
				}).collect(Collectors.toCollection(ArrayList::new));
	}
	public static Integer firstNonRepeatingElement(List<Integer> list) {
		return list.stream()
			    .collect(
			    	Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())
			       )
			    .entrySet()
			    .stream()
			    .filter(e -> e.getValue() == 1)
			    .map(Map.Entry::getKey)
			    .findFirst()
			    .orElse(null); 
	}
	
	public static List<Integer> mergeSortedLists(List<Integer> l1, List<Integer> l2, List<Integer> l3) {
		return Stream.of(l1, l2, l3)
			         .flatMap(Collection::stream) 
			         .distinct()
			         .sorted() 
			         .collect(Collectors.toCollection(ArrayList::new));	
				     
	}
	public static Integer nthLargest(List<Integer> list, Integer n) {
		return list.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.peek(e -> System.out.println(e))
				.skip(n - 1)
				.findFirst()
				.orElse(0);
	}
	
	public static List<Integer> rotateList(List<Integer> list,Integer k) {
		  return  Stream.concat(
			                     list.stream().skip(list.size() - k),
			                     list.stream().limit(list.size() - k)
			                   )
			            .collect(Collectors.toList());
	}
	
	public static List<String> findPalindromes() {
		List<String> list = Arrays.asList("madam", "apple", "racecar", "banana", "civic");

		return list.stream()
				   .filter(str -> new StringBuilder(str)
							  .reverse()
							  .toString()
							  .equals(str)
	                      )
			       .collect(Collectors.toList());

	}
	public static List<Integer> findDuplicates(List<Integer> list) {
		  return  list
			   .stream()
			   .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
			   .entrySet()
			   .stream()
			   .filter(e -> e.getValue() > 1)
			   .map(Map.Entry::getKey)
			   .collect(Collectors.toList());

		}
	
	private static Map<Character, Long> charCount() {
		List<String> list = Arrays.asList("apple", "banana", "cherry");
		return list.stream()
				  .flatMap(str -> str.chars()
				  .mapToObj(c -> (char) c))
				  .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	}
	
	public static Boolean listIsSortedOrNot() {
		List<Integer> list = List.of(1, 2, 3, 4, 5);

		return IntStream.range(1, list.size())
						.allMatch(i -> list.get(i) >= list.get(i - 1));

	}

	public static Map<Integer, List<String>> groupStringsByLength() {
		return List.of("apple", "banana", "cherry", "date", "orange")
				.stream()
				.collect(Collectors.groupingBy(String::length));
	}

	public static Integer productOfAllElements() {
		return List.of(3, 2, 1, 4, 5)
				   .stream()
				   .reduce(1, (product, element) -> product * element);
	}
}
