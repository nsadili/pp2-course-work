package Week05;
public class MathDemo{
    
    public int max(int a,int b){
       
        if(a>b){
            return a;
            
        }
        else if(b>a){
            return b;
        }
        else return 0;
    }
    public int min(int a,int b){
        
        if(a>b){
            return b;
            
        }
        else if(b>a){
            return a;
        }
        else return 0;
    }
    public static int[] args;
    public int sum(int[] args){
        int result= 0;
        for(int i=0;i<args.length;i++){
            result+=args[i];
        }
        return result;
    }
    public float mean(int[] args) {
        int sum = sum(args);
        return (float) sum / args.length;
    }
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Static can be called without creating an instance of the class, which can be useful in 
    // situations where you just need to perform a simple calculation and don't want to create
    // unnecessary objects.
}