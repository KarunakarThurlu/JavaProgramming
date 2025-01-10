package stringhandling;

public class ReverseStringByFrequency {
	public static void main(String... reverseStringByFrequency) {
		String str="programming";
		int fc = 2;
		char[] charArray = str.toCharArray();
		for(int i=0;i<str.length();i=i+fc) {
			int startIndex = i;
			int endIndex = Math.min((i+fc)-1, str.length()-1);
			while(startIndex < endIndex) {
				char tempChar = charArray[startIndex];
				charArray[startIndex++] = charArray[endIndex];
				charArray[endIndex--]   = tempChar;
			}
		}
		System.out.println(new String(charArray));
	}
}
