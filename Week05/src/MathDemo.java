package Week05.src;

public class MathDemo {

    public int min(int a, int b) {
        return Math.min(a, b);
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int num = args[i];
            sum = sum + num;
        }
        return sum;
    }

    public float mean(int[] args) {
        float sum = sum(args);
        return sum / args.length;
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}