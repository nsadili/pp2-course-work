import java.util.Scanner;


public class MathDemo {
    public static void main(String[] args) {
        System.out.println(min(1,5));
        System.out.println(max(6,30));
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));
        System.out.println(mean(arr));
        System.out.println(factorial(5));
        }
    

    public static int min(int a, int b) {
        if(a>b) return b;
        else if (b>a) return a;
        else return a;
    }

    public static int max(int a, int b) {
        if(a>b) return a;
        else if (b>a) return b;
        else return a;
    }

    public static int sum(int[] args) {
        int sum=0;
        for(int i=0; i<args.length; i++) {
            sum+=args[i];
        }
        return sum;
    }

    public static float mean(int[] args) {
        float mean=0.0f;
        int sum=0;
        for(int i=0; i<args.length; i++) {
            sum+=args[i];
        }
        mean=sum/args.length;
        return mean;
    }

    public static int factorial(int n) {
        int fact=1;
        for(int i=1; i<=n; i++) {
            fact *=i;
        }
        return fact;
    }
}
    // the advantage of defining all this methods as static is that we do not have to create objects to access this methods.
