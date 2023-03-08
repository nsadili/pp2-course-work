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
        float sum = sum(args);
        return sum / args.length;
    }
    
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial undefined for negative integers.");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Min: " + MathDemo.min(2, 3));
        System.out.println("Max: " + MathDemo.max(2, 3));
        System.out.println("Sum: " + MathDemo.sum(array));
        System.out.println("Mean: " + MathDemo.mean(array));
        System.out.println("Factorial: " + MathDemo.factorial(5));
    }
}