package Week06.Ex8;

import java.math.BigInteger;

public class TestBigInteger {

    public static void main(String[] args) {

        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of 100: " + fact);

        BigInteger base = BigInteger.valueOf(2);
        BigInteger power = base.pow(100);
        System.out.println("2^100: " + power);
    }

}
