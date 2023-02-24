package PW;

public class MathDemo {
    public static void main(String args[]){
int nums[]={1,2,3,4,5};
System.out.println("Min: " +min(20, -12));
System.out.println("Max: " +max(30, 15));
System.out.println("Sum: " +sum(nums));
System.out.println("Mean: " +mean(nums));
System.out.println("Factorial: " +factorial(5));

    }
    

    public static int min(int a,int b){
        return a<b?a:b;
    }
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static int sum(int[] args){
        int sum=0;
        for(int i=0;i<args.length;i++)
        sum = sum+args[i];
        return sum;
    }
    public static float mean(int[] args){
        return (float)sum(args)/args.length;
    }
    public static int factorial(int n){
        int res=1;
        for(int i=1;i<=n;i++)
        res*=i;
        return res; 
    }

}
