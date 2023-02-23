package Week05.pw;

public class MathDemo {
    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int sum(int[] args) {
        int res = 0;
        for (int i : args) res += i;
        return res;
    }

    public static float mean(int[] args) {
        return (float)sum(args) / args.length;
    }

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Error: factorial of a negative number");
            return -1;
        }
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
