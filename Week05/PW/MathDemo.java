import java.util.Scanner;

public class MathDemo {

    public static int min(int a, int b){
        if(a > b) return a;
        if(a < b) return b;
        else return 0;
    }
    public static int max(int a, int b){
        if(a < b) return a;
        if(a > b) return b;
        else return 0;
    }
    public static int sum(int[] args){
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
           sum += args[i];
        }
        scan.close();
        return sum;
    }
    public static float mean(int[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float sum = 0;
        for(int i = 0; i < n; i++){
           sum += args[i];
        }
        scan.close();
        return sum / n;
    }
    public static int factorial(int n){
        return n * factorial(n-1);
    }

}
    