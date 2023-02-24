import java.util.Scanner;

public class MathDemo {

    public static void main(int[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a and b to find min and max: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Min a, b: " + min(a, b));
        System.out.println("Max a, b: " + max(a, b));

        System.out.println("Enter nums to find sum and mean: ");
        for (int i = 1; i <= args.length; i++)
            args[i] = sc.nextInt();

        System.out.println("Sum args: " + sum(args));
        System.out.println("Mean: " + mean(args));
        System.out.println("Enter n to find factorial");
        int n = sc.nextInt();
        System.out.println("Factorial: " + factorial(n));
        sc.close();
    }

    public static int min(int a, int b) {
        if (a > b)
            return b;
        else
            return a;
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;

    }

    public static int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++)
            sum += args[i];
        return sum;
    }

    public static float mean(int[] args) {
        int sum = sum(args);
        float mean = (float) sum / args.length;
        return mean;
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // If we make them static method we can be called without crating an object of
    // class
    // it can be accessed both using class name and reference
    // and gives us reusability advantage
}
