package week05.geometryy;

public class Mathdemo {
    public static void main(String [] args){

    }
    
    public static int min(int a, int b){
        return (a<b)?a:b;
        
    }
    public static int max(int a, int b){
        if (a<b){
            return a;
        }else return b;
        
    }
    public static int sum(int a, int b){
        return a+b;
    }

    public static int factorial(int n){
        int fact= 1;
        while(n>0){
            fact *=n;
        }
        return fact;
    }
    public static float mean(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        float mean = (float) sum / args.length;
        return mean;
    }

}
/* advantages of static :
 no need to create an instance of the class, increased performance and Utility methods; 
 */