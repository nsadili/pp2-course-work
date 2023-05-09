package Week06.Arithmetics;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        System.out.println(fact(n));
        scanner.close();
    }

    private static BigInteger fact(int n) {
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
