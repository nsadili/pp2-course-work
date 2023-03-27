package EX;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        BigInteger res = BigInteger.valueOf(1);

        for (long n = 1; n <= (long) a; n++)
            res = res.multiply(BigInteger.valueOf(n));
        System.out.println(res);
    }
}