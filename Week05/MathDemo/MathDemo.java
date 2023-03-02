package Week05.MathDemo;

public class MathDemo {
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

    // f. What would be the advantage of defining these methods as static?
    // answer: It helps us a lot, initially, if these methods would be static, means
    // these belong to class
    // It turns out that we can use these in other classes as well as this class
    // regardless creating new object.
    // static means does not belong to object and static class will load regardless
    // of object.

}
