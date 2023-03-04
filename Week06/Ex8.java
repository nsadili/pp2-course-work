package Week06;

import java.math.BigInteger;

public class Ex8 {
 class BigIntegerTest {
    public static void main(String[] args) {
        int n = 30;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + n + " is " + factorial);

        BigInteger base = BigInteger.valueOf(2);
        int exponent = 40; 
        BigInteger power = base.pow(exponent);
        System.out.println(base + "^" + exponent + " is " + power);
    }
}

}
