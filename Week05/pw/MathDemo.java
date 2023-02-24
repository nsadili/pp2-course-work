public class MathDemo{
    public static void main(String[] args) {
        int a=10,b=5,n=6;
        int[] A = {1,2,3,4,5};
        System.out.println("Minimum: "+ min(a,b));
        System.out.println("Maximum: "+ max(a,b));
        System.out.println("Sum of array: "+ sum(A));
        System.out.println("Mean of array: "+ mean(A));
        System.out.println("Factorial: "+ factorial(n));
    }

    private static int min(int a, int b){
        int mn;
        if (a<b) mn=a; else mn=b;
        return mn;
    }

    private static int max(int a, int b){
        int mx;
        if (a>b) mx=a; else mx=b;
        return mx;
    }

    private static int sum(int[] a){
        int sum=0;
        for (int A: a){
            sum+=A;
        }
        return sum;
    }

    private static float mean(int[] a){
        float sum=0;
        int cnt=a.length;
        for (int A: a){
            sum+=A;
        }
        return sum/cnt;
    }

    private static int factorial(int n) {
        if (n < 0) {
            System.out.println("Problem! Please add a positive number");
        }
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}