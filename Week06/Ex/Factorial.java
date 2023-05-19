package Week06.Ex;
import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {


    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer: ");
            int n = scan.nextInt();

            if (n < 0) {
                System.out.println("Invalid input. The integer should be non-negative.");
                return;
            }

            BigInteger result = BigInteger.ONE;

            for (int i = 2; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }

            System.out.printf("%d! = %s%n", n, result);
        }
    }
}
