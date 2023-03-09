package assignment8.src;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {

        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 2; i <= 100; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("100! = " + factorial);

        BigInteger power = BigInteger.valueOf(2).pow(1000);
        System.out.println("2^1000 = " + power);
    }
}
