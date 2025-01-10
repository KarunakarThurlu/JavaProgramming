package arrays;

public class ArraysEx {
    public static void main(String... arrays) {
        /*
         * Q1. What is Array?
         * -------------------
         * A. Array is Collection of Homogenious elements with fixed size
         * 
         * Q2. What is the syntax about array?
         * -----------------------------------
         * A. dataType[] variableName = new dataType[size];
         * 
         * Q3. Example about array?
         * --------------------------
         * int[] a = new int[2];
         * Or
         * int[] a = {4,5,6,7,8,9};
         * 
         * Q4. How to add Elements into array?
         * ---------------------------------------
         * A. arrayVariableName[indexNumber] = value;
         * Ex:   int[] a = new int[2];
         *       a[1] = 10;
         * 
         * Q5. How to get Elements from array?
         * ------------------------------------
         * A. arrayVariableName[indexNumber];
         * Ex:   int[] a = new int[2];
         *       int arrayVal = a[1];
         * 
         * Q6. What is ArrayIntexOutOfBounsException, When it occurs?
         * ------------------------------------------------------------
         * A. When we are trying to access array elements OR adding array elements out of array length(0 to length-1)
         * 
         * int[] a = new int[2];
         *
         * Ex1 : a[3]=20;        // ArrayIntexOutOfBounsException
         * Ex2 : int val =a[-1]; // ArrayIntexOutOfBounsException
         *
         * 
         * 
         * Declaration Rules:
        
           int[] a   = new int[5]; //Valid
           int  [] a = new int[5]; //Valid
           int  []a  = new int[5]; //Valid
           int  a[]  = new int[5]; //Valid
           int  a[]  = new int[];  //InValid

           int[] a;
           a=new int[4];

           long l=10;
           int[] a=new int[l];//InValid

           int[] a=new int[-3];//NegativeArraySizeException

         */

        // What is Array?
        // Array is Collection of Homogenious elements with fixed size

        //Declaring Array
        int[] a = new int[5];

        //Adding elements to an array
        a[0] = 40;
        a[3] = 50;

        //Accessing elements from array
        System.out.println(a[0]);

        //Accessing all elements from array using for loop
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //Declaring Array & Initializing array
        String[] s = { "Java", "Scala", "Kotlin", "Go" };
        System.out.println(s);
    }
}
