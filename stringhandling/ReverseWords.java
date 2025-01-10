package stringhandling;

public class ReverseWords {
	
	public static void main(String... reverseWords) {
		String str="Java is awesome programming language";
		String[] strArray = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(String s:strArray) {
			char[] charArray = s.toCharArray();
			int startIndex=0;
			int endIndex = s.length()-1;
			while(startIndex < endIndex) {
				char tempChar= charArray[startIndex];
				charArray[startIndex++] =charArray[endIndex];
				charArray[endIndex --] = tempChar;
			}
			sb.append(new String(charArray)+" ");
		}
		System.out.println(sb);
	}
}
