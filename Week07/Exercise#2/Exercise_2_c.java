import java.util.Scanner;

public class Exercise_2_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        try {
            int factorial = factorial(n);
            System.out.println(n + "! = " + factorial);
        } catch (IllegalArgumentException e) { //adding line for exceptions
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}