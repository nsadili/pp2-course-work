package Week05.Mathdemo;

public class MathDemo {
    MathDemo(){

    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int[] args) {
        int totalSum = 0;
        for (int x: args) {
            totalSum += x;
        }
        return totalSum;
    }

    public static float mean(int[] args) {
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
}