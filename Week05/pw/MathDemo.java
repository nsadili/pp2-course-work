package pw;

public class MathDemo {
    public static int min(int a, int b) {
        return Integer.min(a, b);
    }

    public static int max(int a, int b) {
        return Integer.max(a,b);
    }

    public static int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    public static float mean(int[] args) {
        int sum = sum(args);
        return (float) sum / args.length;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // * I. Advantage of usage of static method is that it makes our work easier.
    // Since we do not have to every time create new object. */

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14 };

        int a = 80;
        int b = 90;

        int n = 5;

        System.out.println("Minimum of " + a + " and " + b + " is " + min(a, b));

        System.out.println("Maximum of " + a + " and " + b + " is " + max(a, b));

        System.out.println("Sum of elements in array is " + sum(arr));

        System.out.println("Mean of elements in array is " + mean(arr));

        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

}