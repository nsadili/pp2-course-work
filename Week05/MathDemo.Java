public class MathDemo {

    public int min(int a, int b) {
        return Math.min(a, b);
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int sum(int[] args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }

    public float mean(int[] args) {
        int sum = sum(args);
        return (float) sum / args.length;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative.");
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
