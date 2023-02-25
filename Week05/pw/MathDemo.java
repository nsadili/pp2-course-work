public class MathDemo {
        
    public static int min(int a, int b){
        return a < b ? a : b;
    }
    public static int max(int a, int b) {
        return a > b ? a : b;
      }
    public static int sum(int[] args){
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            sum += args[i];
        }
        return sum;
    }  
    public static float mean(int[] args){
        int sum = sum(args);
        float mean = sum / args.length;
        return mean;
    }

    public static int factorial(int n){
        int  sum = 1;
        for (int i = 1; i <= n; i++){
            sum *= i;
        }
        return sum;
    }

    
}


