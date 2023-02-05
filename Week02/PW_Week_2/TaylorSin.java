import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TaylorSin{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of x (in radians): ");
        double x = sc.nextDouble();
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        double sin = 0.0;
        for (int i = 0; i < n; i++) {
            sin += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        double sinMath = Math.sin(x);
        System.out.println("sin(x) using Taylor series: " + sin);
        System.out.println("sin(x) using Math.sin: " + sinMath);
        System.out.println("Difference: " + (sin - sinMath));
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}


