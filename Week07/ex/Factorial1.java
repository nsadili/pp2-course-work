import java.util.Scanner;
public class Factorial1 {
    static int var;
    public static void main(String[] args) {

        try { if (var < 0) {
        System.out.println("The value is negative: " + var);
        }

        } catch (IllegalArgumentException ex) {
            System.out.println("Error:" + ex);
        }
        Scanner scan = new Scanner(System.in);
        int var;

        while (scan.hasNextInt()) {
            var = scan.nextInt();

            System.out.printf("%d! is %d\n", var, factorial(var));
        }

        scan.close();
    }

    static int factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;

        return f;
    }
}