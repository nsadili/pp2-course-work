import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double input = sc.nextDouble();

        if (input < 0) {
            System.out.println("The number is negative.");
        } else if (input > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is neutral .");
        }

        sc.close();
    }
}