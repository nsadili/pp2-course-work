package Week06;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println("Max value long can store: " + Long.MAX_VALUE);
        BigInteger a = new BigInteger(String.valueOf(Long.MAX_VALUE));

        System.out.println(a);
        a = a.add(BigInteger.ONE);
        System.out.println(a);
        System.out.println(1 + Long.MAX_VALUE);

    }
}

class Factorial_Eolymp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        BigInteger res = BigInteger.ONE;
        for(int i=2;i<=n;i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }

        System.out.println(res);
    }
}

class Power_Eolymp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger a = scan.nextBigInteger();
        int n = scan.nextInt();

        BigInteger res = a.pow(n);

        System.out.println(res);
    }
}