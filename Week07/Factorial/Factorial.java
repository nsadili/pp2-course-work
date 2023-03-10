package Week07.Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // We throw new Exception

        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        } else {
            System.out.println(factorial(n));
        }
        /*
         * We can try it with try-catch
         * try {
         * int n = Integer.parseInt(args[0]);
         * System.out.println(factorial(n));
         * } catch (IllegalArgumentException e) {
         * System.out.println(e.getMessage());
         * }
         */

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
        
    }


}