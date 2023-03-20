import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        while (scan.hasNextInt()) {
            num = scan.nextInt();

            System.out.printf("%d! is %d\n", num, factorial(num));
        }

        scan.close();
    }

    static int factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;

        if(n < 0) {
            /*
                IllegalArgumentException is a RuntimeException in Java. This type of exceptions are
                unchecked exceptions, which do not require handling explicitly inside the code. But once
                you face an exception during the run-time (the moment you run and use the program), you
                will face the exception message (try and see).
             */

            throw new IllegalArgumentException("n must be non-negative");
        }

        return f;
    }
}