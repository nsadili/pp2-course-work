import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);

        BigInteger base = sc.nextBigInteger();

        BigInteger exponent = sc.nextBigInteger();

        BigInteger result = base.pow(exponent.intValue());
        System.out.println(result);

    }
}
