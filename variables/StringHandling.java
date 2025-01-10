package variables;

import java.util.Arrays;

public class StringHandling {
	
	public static void main(String ...stringHandling) {
		//1. By Using literal
		
		String str1 = "Programming";
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(6));
		char[] charArray = str1.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		System.out.println(str1.toUpperCase());
		
		String str2 = str1.replace('g', '#');
		System.out.println(str2);
		
		
		
		str1.concat("KT");
		
		System.out.println(str1);
		
		//2. By using new keyword
		
		String s1 = new String("JavaProgramming");
		String s2 = new String("JavaProgramming");
		System.out.println(s1.equals(s2));
	    
	    StringBuilder sb1= new StringBuilder("JavaTutorial");
	    StringBuilder sb2= new StringBuilder("JavaTutorial");
	    
	    System.out.println(sb1.equals(sb2));
	    
	   
	    
	    
	    
	    
	}
}
