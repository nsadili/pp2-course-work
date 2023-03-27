package EX;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        int n = scan.nextInt();
        BigInteger res = a.pow(n);
        System.out.println(res);

    }
}
