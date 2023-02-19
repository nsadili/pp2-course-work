import java.util.Scanner;

public class TaylorSin{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        int n = input.nextInt();
        double sinx = 0;

        for (int i = 0; i < n; i++) {
            double numerator = Math.pow(-1, i) * Math.pow(x, 2 * i + 1);
            double denominator = factorial(2 * i + 1);
            sinx += numerator / denominator;
        }

        double actualSin = Math.sin(x);
        double absoluteError = Math.abs(sinx - actualSin);

        System.out.println("Approximation of sin(" + x + ") using " + n + " terms = " + sinx);
        System.out.println("Actual value of sin(" + x + ") = " + actualSin);
        System.out.println("Absolute error = " + absoluteError);
    }

    public static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
