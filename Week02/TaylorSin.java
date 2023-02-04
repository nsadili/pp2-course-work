import java.util.Scanner;
public class TaylorSin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for x: ");
        double x = sc.nextDouble();
        System.out.print("Enter number of terms n: ");
        int n = sc.nextInt();
        double sin = 0.0;
        for (int i = 0; i < n; i++) {
            double term = 1.0;
            for (int j = 1; j <= 2 * i + 1; j++) {
                term *= (x / j);
            }
            if (i % 2 == 0) {
                sin += term;
            } else {
                sin -= term;
            }
        }
        System.out.println("sin(" + x + ") = " + sin);
    }
    
}
