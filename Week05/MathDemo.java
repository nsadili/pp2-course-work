package Week05;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(max(13,7));
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
        int factr = 1;
        for (int i = 1; i <= n; i++){
            factr *= i;
        }
        return factr;
    }
}