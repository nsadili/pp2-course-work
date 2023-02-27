public class MathDemo {
    public int min(int a, int b) {
        return Math.min(a, b);
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int sum(int[] args) {
        int s = 0;
        for (int i = 0; i < args.length; i++) {
            s += args[i];
        }
        return s;
    }

    public float mean(int[] args) {
        return (float) s(args) / args.length;
    }

    public int f(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}