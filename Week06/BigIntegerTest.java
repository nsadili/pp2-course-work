import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        // factorial
        BigInteger fact = BigInteger.ONE;
        int n = 10000; // compute factorial of 10000
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + n + " is " + fact);

        // power
        BigInteger base = BigInteger.valueOf(2);
        BigInteger exponent = BigInteger.valueOf(10000); // compute 2^10000
        BigInteger result = base.pow(exponent.intValue());
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
