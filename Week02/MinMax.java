import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;

            while (sc.hasNextDouble()) {
                double num = sc.nextDouble();

                if (num < min) {
                    min = num;
                }

                if (num > max) {
                    max = num;
                }
            }

            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);
        }
    }
}
