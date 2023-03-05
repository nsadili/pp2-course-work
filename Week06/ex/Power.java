import java.math.BigInteger;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        sc.close();

        System.out.println(power(a, n));
    }

    private static BigInteger power(int a, int n) {

        BigInteger res = BigInteger.ONE, val = BigInteger.valueOf(a);

        for (int i = 1; i <= n; i++) {

            res = res.multiply(val);
        }

        return res;
    }
}
