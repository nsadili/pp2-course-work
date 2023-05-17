package Week05;

public class MathDemo {
    public int min(int a, int b) {
        return Math.min(a, b);
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int sum(int[] args) {
        int sum = 0;
        for (int num : args) {
            sum += num;
        }
        return sum;
    }

    public float mean(int[] args) {
        if (args.length == 0) {
            return 0.0f;
        }
        int sum = sum(args);
        return (float) sum / args.length;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of a negative number is undefined.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        MathDemo mathDemo = new MathDemo();

        int a = 5;
        int b = 3;
        System.out.println("Minimum: " + mathDemo.min(a, b));
        System.out.println("Maximum: " + mathDemo.max(a, b));

        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println("Sum: " + mathDemo.sum(nums));
        System.out.println("Mean: " + mathDemo.mean(nums));

        int n = 5;
        System.out.println("Factorial of " + n + ": " + mathDemo.factorial(n));
    }
}
