import java.util.Scanner;

public class PolarityChecker {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a double-precision floating-point number: ");
        double num = obj.nextDouble();

        if (num < 0) {
            System.out.println("The number is negative.");
        }
        else if (num > 0) {
            System.out.println("The number is positive.");
        } 
        else {
            System.out.println("The number is neutral.");
        }
    }
}
