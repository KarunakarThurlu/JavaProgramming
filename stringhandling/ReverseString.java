package stringhandling;

public class ReverseString {
	
	public static void main(String... reverseString){
		String str = "ProgrammingKT";
		System.out.println(str);
		char[] charArray = str.toCharArray();
		int startIndex = 0;
		int endIndex = str.length()-1;
		while(startIndex < endIndex) {
			char tempChar = charArray[startIndex];
			charArray[startIndex++] = charArray[endIndex];
			charArray[endIndex--]   = tempChar;
		}
		System.out.println(new String(charArray));
	}
}
