package conditionalstatements;

public class ConditionalStatements {

    public static void main(String ...conditionalStatements) {

        //Conditional Statement   if  else  switch

        //Syntax :  
        /*
        if Block syntax:
        ===============
         if( boolean ){
            //body
         }

        OneLine if else statement
        -------------------------
         if(boolean)
             // oneline Statement


        syntax else:
        ================

         if( boolean ){
            //body
         }else{
            //body
         }

         OneLine if else statement
         -------------------------
         if( boolean )
            //body
         else
            //body
         
         

        Ivalid else
        -------------
        else{

        }

        //Switch syntax
        ===============
        switch(type){
          case 1 :
               statemet;
               break;
          case 2 :
               statemet;
               break;
          case n :
               statement;
               break;
          default:
               statemt;
        }

         */







         
         int x=9;
         if(x%2==0)
            System.out.println(" x is even Number");
         System.out.println(" x is even Number out of if block");
         
         int w =-6;

         switch (w) {
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURESDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("Please enter valid week number");
                break;
         }
         
         
         

    }
}
