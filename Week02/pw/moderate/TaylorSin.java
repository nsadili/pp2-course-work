import java.util.*;
public class TaylorSin {
    public static double sin(double x, int n) {
        double value = 0;
        for (int i = 0; i < n; i++) {
            value += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        return value;
    }

    private static double factorial(int n) {
        double value = 1;
        for (int i = 2; i <= n; i++) {
            value *= i;
        }
        return value;
    }
}
