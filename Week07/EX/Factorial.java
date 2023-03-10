package EX;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int num;

        while (scan.hasNextInt()) {
            num = scan.nextInt();

            try {
                System.out.printf("%d is %d\n", num, factorial(num));
            } catch (IllegalArgumentException a) {
                System.out.println(a.getMessage());
            }
        }

        scan.close();
    }

    static int factorial(int n) throws Exception {

        if (n < 0)
            throw new Exception(String.format("%d! is undefined", n));

        if (n == 0 || n == 1)
            return 1;
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;

        return f;
    }
}