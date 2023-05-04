public import java.util.Scanner;
import java.math.BigInteger;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
   
      BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
          fact = fact.multiply(BigInteger.valueOf(i));
        }
    
        System.out.println(fact);
    }
    
}

 {
    
}
