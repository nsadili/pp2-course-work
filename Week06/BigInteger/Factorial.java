package Week06.BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value: ");
        int val = scan.nextInt();
        BigInteger res = BigInteger.ONE;
        scan.close();
        for (int i = 1; i <= val; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res);
    }
}