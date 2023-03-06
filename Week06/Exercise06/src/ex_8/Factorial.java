package ex_8;
import java.math.BigInteger;

public class Factorial {
    public static void main(String args[]) {
        int n = 20;

        if (n == 0 || n == 1)
            System.out.println(1);
        else {
            BigInteger fact = new BigInteger("1");
            for (int i = 2; i <= n; i++) {
                BigInteger x = new BigInteger(String.format("%d", i));
                fact = fact.multiply(x);
            }

            System.out.println(fact);
        }
    }
}