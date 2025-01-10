package stringhandling;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
	
	public static void main(String[] args) {
		String f="  ";
		System.out.println(f.isEmpty());
		System.out.println(f.isBlank());
		String input="ABC";
		Integer startIndex=0;
		List<String> permutations=new ArrayList<>();
		List<String> permutationsr = findPermutations(input.toCharArray(),startIndex,permutations);
		System.out.println(permutationsr);
	}

	private static List<String> findPermutations(char[] chars,Integer startIndex,List<String> permutations) {
		
		if(startIndex==chars.length) {
			permutations.add(new String(chars));
			return permutations;
		}
		
		for(int i=startIndex;i<chars.length;i++) {
			swap(chars,startIndex,i);
			findPermutations(chars,startIndex+1,permutations);
			swap(chars,startIndex,i);
		}

		return permutations;
	}

	private static void swap(char[] chars, Integer startIndex, int endIndex) {
		char t=chars[startIndex];
		chars[startIndex]=chars[endIndex];
		chars[endIndex]=t;
	}

}
