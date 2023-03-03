package Week05;

public class MathDemo{
    public int min(int a, int b){
        return Math.min(a , b);
    }
    public int max(int a, int b){
        return Math.max(a, b);
    }
    public int sum(int[] args) {
        int result = 0;
        for (int i = 0; i < args.length; i++){
            result =+ i;
        }
        return result;
    }
    public float mean(int[] args) {
        int sum = sum(args);
        return (float) sum / args.length;
    }
    public int factorial(int i){
        if (i <= 0){
            return 1;
        }
        else{
            return i * factorial(i-1);
        }
    }
     
     // The advantage of defining these methods as static is that they can be
     // called without needing to create an instance of the MathDemo class.
     // This can be useful if the methods are independent of any specific
     // instance data, or if you want to use the methods in a more functional
     // programming style. 
}
