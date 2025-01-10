package variables;

public class WrapperExamples {
	
	public static void m1() throws Exception {
		m2();
		System.out.println("M1");
	}
	public static void m2() throws Exception {
		System.out.println("M2");
		System.out.println(10/0);
	}
	public static void main(String  ...wrapperClass) throws Exception  {

//All Wrapper Classes are final & implements Comparable?
	
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	
	m1();
	System.out.println(4);
	System.out.println(5);
	System.out.println(6);
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//What is Integer Wrapper class cache and range?
		
		// -128 to 127
			
	/*
			Integer intObj1 = 120;
			Integer intObj2 = 120;
			
			System.out.println(intObj1==intObj2);
			
			Integer intObj3 = 128;
			Integer intObj4 = 128;
			
			System.out.println(intObj3==intObj4);		
		
		
		*/
		
		
		
	//Q. What is Auto Boxing?
    //A. Process of converting primitive to Wrapper Object
	
	//Example:-
	
  /*
	int intVal = 10;
	
	Integer intObj = intVal;

	 //OR
	
	Integer intObjVal = Integer.valueOf(intVal);
  */
	
//	System.out.println(intObj);
//	System.out.println(intObjVal);
//	System.out.println("-----------------");
//		
	//Q. What is Auto UnBoxing?
    //A. Process of converting Wrapper Object to primitive
	
	//Example:-
	//int intValue = intObjVal.intValue();
//	System.out.println(intValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//1. We can't assign null values
		
		int i=0;
		Integer intObj = null;
		
		//2. with primitives we can't perform any operations by using methods
		
		String s = "13";
		int int1 = Integer.parseInt(s);
		System.out.println(int1);
		
		int maxValue = Integer.MAX_VALUE;
		System.out.println(maxValue);
		
		Integer i1  = 13;
		Integer i2  = 12;
		int compareTo = i1.compareTo(i2);
		
		System.out.println(compareTo);
		
		//3. Primitives dosn't support Generics
		
		List<Integer> a=new ArrayList<>();
		
	*/
		
	}
}
