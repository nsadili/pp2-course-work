import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        while (sc.hasNextDouble()) {
            double num = sc.nextDouble();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
