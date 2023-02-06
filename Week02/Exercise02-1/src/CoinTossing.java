import java.util.Scanner;
import java.lang.Math;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            double x  = Math.random();
            if (x > 0.5)
                System.out.println("Heads");
            else
                System.out.println("Tails");
        }
    }
}
