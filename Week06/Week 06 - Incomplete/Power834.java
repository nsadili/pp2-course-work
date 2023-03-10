import java.math.BigInteger;
import java.util.Scanner;

public class Power834 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, n;

        a = scan.nextInt();
        n = scan.nextInt();

        System.out.println(power(a, n));

        scan.close();
    }

    private static BigInteger power(int a, int n) {

        BigInteger p = BigInteger.ONE, val = BigInteger.valueOf(a);

        for (int i = 1; i <= n; i++) {
            p = p.multiply(val);
        }

        return p;
    }
}
