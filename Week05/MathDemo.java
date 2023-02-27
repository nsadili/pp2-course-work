package Week05;

public class MathDemo {
    public static int min (int x, int y){
        if(x<y) min=x; else min=y;
    }
    public static int max(int x, int y){
        return (x > y) ? x : y;
    }
    public static int sum(int[] args){
    int sum=0;
    for(int i; i<=args.length; i++){
    sum+=i;
    } return sum;
    }
    public static  float mean(int[] args) {
        
    }
    private static int factorial(int n){
        int factorial=1;
        for(i=2;i<=n.length){
            factorial*=i;
        } return factorial;
    }
        
    
}
