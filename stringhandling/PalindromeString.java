package stringhandling;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalindromeString {
	
	public static void main(String...  palindromeString) {
		String source = "window";
		char[] charArray = source.toCharArray();
		int startIndex = 0;
		int endIndex = source.length()-1;
		while(startIndex < endIndex) {
			char tempChar = charArray[startIndex];
			charArray[startIndex++] = charArray[endIndex];
			charArray[endIndex--]   = tempChar;
		}
		String target = new String(charArray);
		if(source.equals(target))
			System.out.println(source+" is Palindrome");
		else
			System.out.println(source+" not Palindrome");
		
		
		"swiss"
		.chars()
		.mapToObj(c -> (char) c)
		.collect(
				Collectors.groupingBy(
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
		.ifPresentOrElse(
					       (e)->System.out.println(e),
					       ( )->System.out.println("Not Found")
						);
	}
}
