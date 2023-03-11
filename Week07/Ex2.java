package Week07;

import java.util.Scanner;

public class Ex2 {

 static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of a negative number is undefined.");
        }
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();
        input.close();
        try {
            int result = factorial(n);
            System.out.println(n + "! = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: factorial of a negative number is undefined.");
        }
    }
    
}
