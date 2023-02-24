public class MathDemo {

    public static int min(int a, int b){
        return (a<b) ? a : b;
    }
    public static int max(int a, int b){
        return (a > b) ? a : b;
    }

    public static int sum(int[] args){
        int sum = 0;
        for(int i: args){
            sum+= i;
        }
        return sum;
    }

    public static float mean(int[] args){
        int sum = 0;
        for(int i: args){
            sum += i;
        }
        return (float)sum /args.length;
    }

    public static int factorial(int n){
        int f;
        if(n == 0){
           f = 1;
        }else {
            f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
        }
        return f;
    }
}