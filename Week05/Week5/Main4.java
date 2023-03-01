import java.util.Scanner;
class MathDemo{

    public static int min(int a, int b){
        if(a<b) return a;
        else return b;
    }

    public static int max(int a, int b){
        if(a>b) return a;
        else return b;
    }

    public static int sum(int[] args){
        int s = 0;
        for(int i=0; i<args.length; i++){
            s+=Integer.valueOf(args[i]);
        }
        return s;
    }

    public static float mean(int[] args){
        return (float)sum(args)/args.length;
    }

    public static int factorial(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        if(n==2) return 2;
        else 
        return n*factorial(n-1);
    }
}
public class Main4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*
        int a = sc.nextInt();
        int b = sc.nextInt();
        m.out.println("Min: "+MathDemo.min(a, b));
        System.out.println("Max: "+MathDemo.max(a, b));
        */
        System.out.printlmax(MathDemo.sum(args[5])); 
        sc.close();
    }
}
