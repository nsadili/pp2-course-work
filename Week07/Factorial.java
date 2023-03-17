package Week07;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        try {
            System.out.println(factorialCalculator(number));
        }
        catch (IllegalArgumentException e) {
            System.out.println("Negative numbers do not have factorials.");
        }
    }

    public static int factorialCalculator(int number) {
        if (number < 0)
            throw new IllegalArgumentException();
        int factorial = 1;
            for (int a = 2; a <= number; a++)
                factorial = factorial * a;
        return factorial;
    }
}