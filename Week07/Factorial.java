package exercise7;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer: ");
            int n = sc.nextInt();
            int factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }
    }


public static int factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Input must be non-negative");
    }
    int result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}
}
