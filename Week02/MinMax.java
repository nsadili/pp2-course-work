import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        while (input.hasNextDouble()) {
            double num = input.nextDouble();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
    }
}

