package EX;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(max(10,8));
    }
    
    public static int min (int a, int b){
        return a < b ? a : b;
    }

    public static int max (int a, int b){
        return a > b ? a : b;
    }

    public static int sum (int[] args){
        int sum = 0;
        for (int i = 0; i < args.length; i++){
            sum +=  args[i];
        }
        return sum;
    }   

    public static float mean(int[] args){
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < args.length; i++){
            sum += args[i];
            cnt++;
        }
        return sum / cnt;
    }

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
}

// The advantage of defining these methods as static is that we don't need to create an instance of the MathDemo class to use them. We can simply call the methods directly using the class name, like MathDemo.min(13, 6)