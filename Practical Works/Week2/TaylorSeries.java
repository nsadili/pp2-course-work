import java.util.Scanner;

public class TaylorSeries {

    private static int fact(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a floating-point value x: ");
        double x = obj.nextDouble();

        System.out.print("Enter an integer n: ");
        int n = obj.nextInt();

        double sin = 0;
        for (int i = 0; i < n; i++) {
            double term = Math.pow(-1, i) * Math.pow(x, 2*i+1) / fact(2*i+1);
            sin += term;
        }
        double calcSin = Math.sin(x);
        System.out.println("Approximated value of sin(x): " + sin);
        System.out.println("Calculated sin(x): " + calcSin);
        System.out.println("Difference: " + Math.abs(sin - calcSin));
    }

}
