package taghi_mammadov.week_02;
import java.util.*;
public class CoinTossing {
    public static void main(String[] args){

        /*if (args.length < 1){
            System.out.println("Please, enter a value!");
            System.exit(1);
        } */

       int n = Integer.parseInt(args[0]);
        Integer.valueOf(args[0]);
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Input first number: ");
            double res;
            int CntHead = 0;
            int CntTail = 0;
       
            for(int k = 0; k < n; k++) {
                res = Math.random();
       
           if (res < 0.5) {
               //System.out.println("Head");
               CntHead++;
           } 
           
           else {
               //System.out.println("Tail");
               CntTail++;
           }
              
            }
            System.out.printf("Tail : %d and Head : %d\n", CntTail, CntHead);
        }
            

     
    }
    
}
