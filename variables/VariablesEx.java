package variables;

public class VariablesEx {

/*
 * Notes about variables:-
 * ----------------------
 * 0. What is the use variables
 * 1. Types of variables
 * 2. Declaring variables
 * 3. Initialization of variables
 * 4. Variables Scope
 * 5. Memory Allocation
 * 6. Modifiers
 * 7. Rules Declaring variables
 *    (1) . Contains letterls,digits,_,$ 
 *    (2) . Must begin with letter
 *    (3) . variables are case sensitive. Ex: name  NAME
 *    (4) . Resorved words cant use as varible name Ex: int boolean = 10;
 *    (5) . No Duplicates 
 */



    // Global variable
    static int age = 25;
    final static float PI = 3.14f;


    public static void main(String[] args) {

       //(1) . Contains letterls,digits,_,$ 
       int scrore = 100;
      


        System.out.println(PI);
        // Variable Declaration
         int id;

        // Variable Inilization
        id = 154;

       // Variable Declaration and Inilization
        boolean isAdult = true;

        // Declaring more than one variable at a time
        int a, b, c;

        // Initialization of more than one variable at a time
        a = b = c = 10;

        //Printing values of variables that holding
        System.out.println("id :"+ id);
        System.out.println("isAdult :"+ isAdult);
        System.out.println("a :"+ a);

        //Calling static method
        printName();
    }

    public static void printName() {
    
        //Printing global variable value
        System.out.println("Inside print" + age);
    }
}
