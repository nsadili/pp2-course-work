package week05;

// We can call static methods without creating an instance of the class.It can help to reduce memory usage.
public class MathDemoStatic {
    public static int staticMin(int a, int b) {
        return Math.min(a, b);
    }

    public static int staticMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int staticSum(int[] args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }
        return result;
    }

    public static float staticMean(int[] args) {
        int sum = staticSum(args);
        return (float) sum / args.length;
    }

    public static int staticFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * staticFactorial(n-1);
        }
    }
}
