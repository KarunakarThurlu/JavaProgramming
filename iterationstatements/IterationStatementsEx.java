package iterationstatements;

public class IterationStatementsEx{

    public static void main(String ...iterationStatements) {
        
        //while loop

        int n=127;
        int armNumber = n;
        int s=0;

        while (n>0) {
           int r = n%10;
           s=s+(r*r*r);
           n=n/10;
        }

        if(s==armNumber)
            System.out.println(armNumber +" is ArmNumner");
        else
            System.out.println(armNumber+" is not ArmNumber");

       // do while

       do{
          System.out.println("Do while body...");
       }while(false);

      int i=0;
      while (i<=10) {
        
        if(i==5){
            i++;
            continue;
        }
        System.out.println(i);
        i++;
      }

    }
}

