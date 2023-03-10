package week07;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        while (scan.hasNextInt()) {
            num = scan.nextInt();

            try {
                System.out.printf("%d! is %d\n", num, factorial(num));
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }

        scan.close();
    }

    static int factorial(int n) throws IllegalArgumentException {

        if (n < 0) {
            throw new IllegalArgumentException("Negative values are not allowed");
        }

        if (n > 10) {
            throw new IllegalArgumentException("Sorry, I can't handle values above 10");
        }

        if (n == 0 || n == 1)
            return 1;

        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;

        return f;
    }
}
