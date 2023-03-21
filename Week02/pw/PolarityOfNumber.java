import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        if (num < 0) {
            System.out.println("Negative");
        } else if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Neutral");
        }
    }
}
