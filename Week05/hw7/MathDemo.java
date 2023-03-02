public class MathDemo {
    
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
    
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    
    public static int sum(int[] args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }
        return result;
    }
    
    public static float mean(int[] args) {
        if (args.length == 0) {
            return 0;
        }
        return (float) sum(args) / args.length;
    }
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
