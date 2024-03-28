package methods;

public class MethodsEx {

    int x = 10; //Instance Variable
    int y = 20; //Instance Variable

    static char a='A';//static Variable
    static char b='B';//static Variable
    
    public static void main(String  ...methods) {
       MethodsEx m = new MethodsEx();
       System.out.println(m.x);
       System.out.println(m.y);
       m.instanceMethodObe();

       System.out.println(MethodsEx.a);
       staticMethodOne();
    } 

    //Static Method
    public static void staticMethodOne(){
        MethodsEx m = new MethodsEx();
        System.out.println(m.x);
    }

    //Instance Method
    public void instanceMethodObe(){ 
        System.out.println(x);
        System.out.println(a);
        instanceMethodTwo();
    }

    //Instance Method
    public void instanceMethodTwo(){ 
        System.out.println(y);
    }



}