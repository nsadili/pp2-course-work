import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);

        BigInteger a = sc.nextBigInteger(); // base

        BigInteger b = sc.nextBigInteger(); // exponent

        BigInteger result = a.pow(b.intValue());
        System.out.println(result);

    }
}
