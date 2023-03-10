package EX;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();

        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer: ");
            int n = scanner.nextInt();
            int result = factorial(n);
            System.out.println(result);
        }
    }
}
