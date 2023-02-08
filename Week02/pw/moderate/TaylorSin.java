import java.util.Scanner;

public class TaylorSin {
    public static long fac(long n) {
        if (n == 0) return 1;
        return n * fac(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), sum = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum += Math.pow(-1, i) * (Math.pow(x, 2 * i + 1) / fac(2 * i + 1));
        }
        System.out.printf("The result is: %.5f\n", sum);
        System.out.printf("The real sine value: %.5f\n", Math.sin(x));
    }
}
