
public class MathDemo {
    

    public static int min(int a, int b){
        return (a < b) ? a : b;
    }
    public int max(int a, int b){
        return (a > b) ? a : b;
    }
    public int sum(int[] args){
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }
    public float mean(int[] args){
        int sum = 0;
        for(float x: args){
            sum += x;
        }
        float mean = sum/args.length; 
        return mean;
    }
    public int factorial(int n){
        int fac = 1;;
        for(int i = 1; i<=n; i++){
            fac *=i;
        }
        return fac;
    }

}
