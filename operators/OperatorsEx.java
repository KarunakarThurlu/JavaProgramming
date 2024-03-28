package operators;

public class OperatorsEx {
    public static void main(String[] args) {
        // // 1. Arithmetic Operators + - * % /

        // int i = 10;
        // int j = 5;
        // System.out.println("================Arithmetic
        // Opearators======================");
        // System.out.println(i + j); // 15
        // System.out.println(i - j); // 5
        // System.out.println(i * j); // 50
        // System.out.println(i % j); // 0
        // System.out.println(i / j); // 2

        // // 2. Unary Operators ! ++ ---
        // System.out.println("================Unary Opearators======================");

        // if (!(i != j)) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }

        // for (int k = 1; k <= 10; k++) {
        // System.out.print(k + " ");
        // }
        // System.out.println();
        // for (int k = 50; k >= 40; k--) {
        // System.out.print(k + " ");
        // }
        // System.out.println();
        // int a=40;
        // //System.out.println(++a);//41
        // System.out.println(a++);//40
        // System.out.println(a);//40
        // System.out.println();

        // // 3. Assignment Operators = += -= *= %= /=
        // System.out.println("================Assignment
        // Opearators======================");
        // int z = 30;

        // z += 5; // z=z+5
        // System.out.println(z);

        // 4. Relational Operators < <= > >= == !=
        int i = 10;
        int j = 11;
        if (i <= j)
            System.out.println(" Big Values :" + j);
        else
            System.out.println(i);

        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }
        for (int k = 100; k >= 90; k--) {
            System.out.println(k);
        }

        if(i!=j){
            System.out.println("Both variavles holding Diif values");
        }

        //5. Logical Operators  && || !

         //Logical AND
         // T && T ==> T
         // F && T ==> F
         // T && F ==> F
         // F && F ==> F
        int x=12; int y=13;
        if(x>10 && y<50)
            System.out.println(true);
        else
            System.out.println(false);

        //Logical OR
         // T || T ==> T
         // F || T ==> T
         // T || F ==> T
         // F || F ==> F
         if(x>12 || y<12)
             System.out.println( "Logical OR "+true);
         else
         System.out.println( "Logical OR "+false);

         //Logical Not
         // T ==> !T ==> F
         // F ==> !F ==> T
         if(!(x>0)){
            System.out.println( "Logical Not "+true);
         }else{
            System.out.println( "Logical Not "+false);
         }

         //6. Ternary Operator  ?  : 
         int z;
         if(x>y){
            z=x;
         }else{
            z=y;
         }
         System.out.println("Z val "+z);

         int tr= x>y?x:y;
         System.out.println("Ternary Operator Result : "+tr);

    }
}
