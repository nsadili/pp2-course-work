import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minimum = Double.POSITIVE_INFINITY;
        double maximum = Double.NEGATIVE_INFINITY;

        while (sc.hasNextDouble()) {
            double current = sc.nextDouble();
            minimum = Math.min(minimum, current);
            maximum = Math.max(maximum, current);
        }

        System.out.println(minimum);
        System.out.println(maximum);
    }
}