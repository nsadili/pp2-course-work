
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;
            while (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();

                if (value < min) {
                    min = value;
                }

                if (value > max) {
                    max = value;
                }
                
            }
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
    }
}
