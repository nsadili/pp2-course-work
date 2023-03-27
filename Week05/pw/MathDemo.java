public class MathDemo {
    public static void main(String args[]) {
        int nums[] = { 5, 7, 9, 11, 13 };
        System.out.println("Min: " + min(5, 13));
        System.out.println("Max: " + max(13, 5));
        System.out.println("Sum: " + sum(nums));
        System.out.println("Mean: " + mean(nums));
        System.out.println("Factorial: " + factorial(5));
    }

    public static int min(int x, int y) {
        return x < y ? x : y;
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++)
            sum = sum + args[i];
        return sum;
    }

    public static float mean(int[] args) {
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        int res = 1;
        if (n==0 || n==1) return 1;
        for (int i = 1; i <= n; i++)
            res *= i;
        return res;
    }

}