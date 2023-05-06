package Week02;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        System.out.println("Enter floating-point values :");

        while (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();

            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

