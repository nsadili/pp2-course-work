package Week05;

public class MathDemo {
    public static int min (int x, int y){
        if(x<y) return x; 
        else return y;
    }
    public static int max(int x, int y){
        return (x > y) ? x : y;
    }
    public static int sum(int[] args){
    int sum=0;
    for(int i=0; i<=args.length; i++){
    sum+=args[i];
    } 
    return sum;
    }
    public static  float mean(int[] args) {
       int sum = sum(args);
       float mean =(float) sum / args.length;
       return mean; 
    }
    private static int factorial(int n){
        int factorial=1;
        for(int i=2;i<=n; i++){
            factorial*=i;
        } 
        return factorial;
    }
        
    
}
