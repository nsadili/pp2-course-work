package EX;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex8_Power {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        int n = scan.nextInt();
        BigInteger res = a.pow(n);
        System.out.println(res);

    }

}
