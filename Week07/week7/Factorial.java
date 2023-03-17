package pp2.week7;

public class Factorial {
    private Factorial() {
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot find factorial of a negative integer");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Main code:
    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter a non-negative integer: ");
    // int n = input.nextInt();
    // try {
    //     int result = factorial(n);
    //     System.out.println(n + "! = " + result);
    // } catch (IllegalArgumentException e) {
    //     System.out.println(e.getMessage());
    // }
}
