import java.util.Scanner;
import java.lang.Math;

public class DiceMan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter zero to terminate the program.");
        System.out.println("Enter the value of two dice (or enter zero to terminate the program): ");
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            if (n == 0) break;
            if (n > 12 || n < 2) {
                System.out.println("Error: value impossible to obtain. Please enter a number within the range of 2-12:");
                continue;
            }

            double r = Math.random();
            while (r < 0.01 || r > 0.13) {
                r = Math.random();
            }
            if (n == (int)(r * 100)) System.out.println("Correct!");
            else System.out.println("Wrong!");
            System.out.println("Enter the value of two dice: ");
        }
    }
}
