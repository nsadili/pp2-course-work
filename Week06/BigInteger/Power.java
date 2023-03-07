package Week06.BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter as: _  _\n");
        int val = scan.nextInt(); 
        int pow = scan.nextInt();
        BigInteger res = BigInteger.ONE;
        BigInteger bigVal = BigInteger.valueOf(val);
        for (int i = 1; i <= pow; i++) {
            res = res.multiply(bigVal);
        }
        System.out.println(res);
        scan.close();
    }
}