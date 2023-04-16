import java.util.Scanner;

/**
 * To compile: javac -d ./classes .\RandomPointsInCircle.java <br />
 * To execute: java -cp .\classes\ RandomPointsInCircle {value for # points}
 * <br />
 * 
 * @author Nuraddin Sh. Sadili
 */

public class RandomPointsInCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please, enter a positive number: ");
        int n = scan.nextInt();

        if (n < 1) {
            System.out.println("Non-positive value is entered!");
            System.exit(0);
        }

        double x, y;

        while (n-- > 0) {
            do {
                x = Math.random();
                y = Math.random();
            } while (x * x + y * y > 1);

            System.out.printf("The point is on (%f, %f)\n", x, y);
            // System.out.printf("The point is on (%f, %f) sum of sqr = %.3f\n", x, y, x * x
            // + y * y);
        }

        scan.close();
    }
}
