import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        try {
            int factorial = factorial(num);
            System.out.println("Factorial " + num + " is: " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Input number must be non-negative");
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
