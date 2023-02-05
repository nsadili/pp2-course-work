import java.util.*;
public class CoinTossing {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
         int n= scn.nextInt();
        // if (Math.random() < 0.5){
           // System.out.println("Heads");
       //  }
   // else{
     //       System.out.println("Tails");
   // }
   double headprobab=n*1.0 /2;
   double tailprobab= n*1.0 /2;
   System.out.println("The probability of getting head is:"+headprobab);
   System.out.println("The probability of getting a tail is:"+tailprobab);

    }
}
