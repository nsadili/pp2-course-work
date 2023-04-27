package Week02;
import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a double-precision floating-point number: ");
            double number = sc.nextDouble();

            if (number < 0) {
                System.out.println("The number is negative");
            } else if (number > 0) {
                System.out.println("The number is positive");
            } else {
                System.out.println("The number is neutral");
            }
        }
    }
}

