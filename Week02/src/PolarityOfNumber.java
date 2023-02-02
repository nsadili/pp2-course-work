import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double input = scn.nextDouble();
        if (input > 0) {
            System.out.println("Positive");
        } else if (input < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
