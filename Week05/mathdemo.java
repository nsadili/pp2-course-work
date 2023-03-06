package Week05;

public class mathdemo {
    public static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static int sum(int[] args) {
        int x = 0;
        for (int i = 0; i < args.length; i++) {
            x += args[i];
        }
        return x;
    }

    public static float mean(int[] args) {
        return sum(args) / (args.length);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return factorial(n - 1) * n;
    }
}
