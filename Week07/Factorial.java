package Week07;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        try
        {
            int factorial = fact(n);
        }
        catch (IllegalArgumentException exception) {
            System.out.println("Negative numbers are not allowed: " + exception);
        }
    }




    public static int fact(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Negative numbers are not allowed");
        int f = 1;
            for (int i = 2; i <= n; i++)
                f = f * i;
        return f;
    }
}
