import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;

            while (scanner.hasNextDouble()) {
                double num = scanner.nextDouble();
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        }
    }
}
