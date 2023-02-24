import java.util.*;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        if ( input > 0) {
            System.out.println("The number is positive.");
        } else if (input == 0.0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is negative.");
        }
    }
}
