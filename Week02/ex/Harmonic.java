// package Week02.ex;

public class Harmonic {
    public static void main(String args[]){
        double n = Double.valueOf(args[0]);
        double sum = 0;
        for(double i = 1; i <= n; i++){
            sum += 1/i;
            
        }
        System.out.printf("%f", sum);
    }
}
