package Week02;

import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for x in radians: ");
        double x = scanner.nextDouble();

        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            int exponent = 2 * i + 1;
            double term = Math.pow(-1, i) * Math.pow(x, exponent) / factorial(exponent);
            sum += term;
        }

        System.out.println("sin(" + x + ") = " + sum);
    }

    // Helper method to compute the factorial of an integer
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

