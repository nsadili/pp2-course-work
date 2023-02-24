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
        for(int x: args) {
            sum += x;
        }
        return sum;
    }
    public static float mean(int[] args) {
        return (float) sum(args) / args.length;
    }
    public static int factorial(int n) {
        int factorial = 1;
        for(int i = 2; i <= n; i++)
            factorial *= i;
        return factorial;
    }
}
