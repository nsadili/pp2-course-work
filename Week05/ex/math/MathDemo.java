package math;

public class MathDemo {

    // Defining these methods as static would make them callable without an instance of the MathDemo class, 
    // simplifying code and potentially improving performance, especially if the methods are stateless and do not
    // rely on any instance variables.
    
    public static int min (int a, int b){
        return (a>b)?b:a;
    }

    public static int max (int a, int b){
        return (a<b)?b:a;
    }

    public static int sum (int[] args){
        int sum=0;
        for(int i = 0; i<args.length; i++){
            sum+=args[i];
        }
        return sum;
    }

    public static float mean (int[] args) {
        int sum=0;
        for(int i = 0; i<args.length; i++){
            sum+=args[i];
        }
        return (float)sum/args.length;
    }

    public static int factorial (int n){
        int sum=1;

        if (n==0 || n==1) return 1;
        
        for(int i = 1; i<=n; i++){
            sum*=i;
        }
        return sum;
    }
}
