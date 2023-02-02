 import java.util.*;
public class Fact {
   

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int number     = scn.nextInt();
         int factorial = 1;
         if(number<0) System.out.println("ERROR");
        else{
         for(int i = 1; i<=number; i++)
         {
             factorial *= i;
             if (i == number){
                 System.out.print(i);
                 continue;
             }
             System.out.print(i + " * ");
         }
         System.out.println(" = " + factorial);
    }
}
}
