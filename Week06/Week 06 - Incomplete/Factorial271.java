import java.math.BigInteger;
import java.util.Scanner;
public class Factorial271 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        System.out.println(fact(n));
        scan.close();
    }
    private static BigInteger fact(int n) {
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
