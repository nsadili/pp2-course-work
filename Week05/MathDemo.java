import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The minimum of " + a + " and " + b + " is " + min(a, b));
        System.out.println("The maximum of " + a + " and " + b + " is " + max(a, b));
        System.out.print("Enter the number of integers: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The sum of the integers is " + sum(numbers));
        System.out.println("The mean of the integers is " + mean(numbers));
        System.out.print("Enter a number to calculate its factorial: ");
        int number = input.nextInt();
        System.out.println(number + "! = " + factorial(number));
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    public static float mean(int[] args) {
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}