import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter variable:");

        double n = input.nextDouble();

        if (n < 0) {
            System.out.println("Negative");

        } else if (n > 0) {
            System.out.println("Positive");

        } else {
            System.out.println("Neutral");
        }

    }
}

