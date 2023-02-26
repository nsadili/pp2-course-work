public class MathDemo {

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    public static float mean(int[] args) {
        int sum = sum(args);
        return (float) sum / args.length;
    }

    public static int factorial(int n) {
        if (n == 0) 
        return 1;
        else 
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        
        int[] arr = {4, 9, 44, 49, 94, 99};
        int a = 4, b = 9, n = 4;

        System.out.println("Min: " + min(a,b));
        System.out.println("Max: " + max(a,b));
        System.out.println("Sum: " + sum(arr));
        System.out.println("Mean: " + mean(arr));
        System.out.println("Factorial: " + factorial(n));
    }
}