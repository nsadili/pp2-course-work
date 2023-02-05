import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        while (input.hasNextDouble()) {

            double n = input.nextDouble();

            if (n < min)
             {
                min = n;
            }

            if (n > max)
             {
                max = n;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

    }
}
