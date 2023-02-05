import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double n = scn.nextDouble();
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
