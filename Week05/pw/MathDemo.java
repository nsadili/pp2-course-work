package pw;
public class MathDemo {
    public int min(int x, int y) {
        return Math.min(x, y);
    }

    public int max(int x, int y) {
        return Math.max(x, y);
    }

    public int sum(int[] args) {
        int total = 0;
        for (int i : args) {
            total += i;
        }
        return total;
    }

    public float mean(int[] args) {
        if (args.length == 0) {
            return 0;
        }
        int total = sum(args);
        return (float) total / args.length;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}