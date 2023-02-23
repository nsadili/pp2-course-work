package Week05;

public class MathDemo {
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) 
            sum += args[i];
        
        return sum;
    }

    public static float mean(int[] args) {
        float res = (float)(sum(args) / args.length);
        return res;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++)
            f *= i;
        return f;
    }
}
