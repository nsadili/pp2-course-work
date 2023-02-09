//package taghi_mammadov.week_02;
import java.util.*;
public class SumOfOdd {
    public static void main(String[] args){
        int N,K, i, sum = 0;
 
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a first number");
            N = in.nextInt();
            System.out.println("Enter a second number");
            K = in.nextInt();
        }
        for(i = 0; i <= K; i++){
            if((i%2) == 1){
                sum += i;
            }
        }
     
        System.out.print("Sum of all odd numbers between "+ N +" to " + K + " = " + sum);

    }
}
