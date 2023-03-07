import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(factorial(a));
    }
    private static BigInteger factorial(int a) {
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= a; i++) {
            f = f.multiply(BigInteger.valueOf(i));
} return f;
    }
}