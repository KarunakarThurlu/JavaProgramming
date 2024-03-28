package methods;

public class Methods {
    /*
     * 1. What is a method and use of the method
     * 2. Syntax and example
     * 3. Types of methods
     * 4. Rules for variables and methods
     * 
     * 
     * How many ways to write a method (static OR instance):-
     * =====================================================
     * 1. Method with paramter
     * 2. Method without paramter
     * 3. Method with return
     * 4. Method without return
     * 
     */

    public static void main(String... methods) {
        Methods m = new Methods();
        m.methodWithParamter(12, 13, 14); 
        m.methodWithOutParameter();
        int pr = m.methodWithReturn(1, 2, 3);
        System.out.println("methodWithReturn " +pr);
        m.methodWithOutReturn(8,9,6);
    }

    //1. Method with paramter
    public void methodWithParamter(int x, int y, int z) { 
        int result = x * y * z; 
        System.out.println("methodWithParamter " + result);
    }

    //2. Method without paramter
    public void methodWithOutParameter() {
        int x = 10, y = 20, z = 30;
        int product = x * y * z;
        System.out.println("methodWithOutParameter " + product);
    }

    //3. Method with return
    public int methodWithReturn(int x, int y, int z) {
        int product = x * y * z;
        return product;
    }

    //4. Method without return
    public void methodWithOutReturn(int x, int y, int z) {
        int product = x * y * z;
        System.out.println("methodWithOutReturn " + product);
    }
}
