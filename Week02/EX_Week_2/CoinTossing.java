import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;


public class CoinTossing{
 public static void main(String[] args) {

    if(args.length < 1){
        System.out.print("Enter a Number: ");
        System.exit(1);
    }
   
    var NumberOfTrials = Integer.parseInt(args[0]);
    double res;
    

    for(int i = 1; i <= NumberOfTrials; i++){
        res = Math.random();
        if (res < 0.5){
            System.out.printf("%d: Head\n", i);
        }
        else{
            System.out.printf("%d: Tail\n", i);
        }
    }
    

}
}



