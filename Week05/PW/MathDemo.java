import java.util.Scanner;

public class MathDemo {

    public static int min(int a, int b){
        return a<b?a:b;
    }
    public static int max(int a, int b){
        return a>b?a:b;
    }

    public static int sum(int[] args){
        int total=0;
        for(int k:args){
            total+=k;
        }
        return total;
    }

    public static float mean (int[] args){
        int total=0;
        int count=0;
        for(int k:args){
            total+=k;
            count++;
        }
        return total/count;
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return factorial(n-1)*n;
        }
    }
}
