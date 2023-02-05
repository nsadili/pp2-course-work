//import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        System.out.printf("sum: %d\ndifference: %d\nproduct: %d\ninteger division: %d\nremainder: %d\n", m + n, n - m, n * m, n / m, n % m);
        //System.out.println(args.length);
    }
}
