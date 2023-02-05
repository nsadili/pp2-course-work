import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double n = 1.0; // terms
        double res = 0.0;

        x %= (2 * Math.PI);

        for( int i = 1; n != 0; i++){
            n *= (x / i);

            if(i % 4 == 3){
                res -= n;
            }
            if(i % 4 == 1){
                res += n;
            }
        }
        System.out.println("sin(x) is " + res);
    }
}
