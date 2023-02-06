import java.util.Scanner;
import java.lang.Math;

public class TaylorSin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        int n = scan.nextInt();
        double s = 0;
        
        for (int i = 0; i <= n; i ++) {
            long fact = 1;
            for (int j = 2; j <= 2 * i + 1; j++)
                fact *= j;

            s += 1.0 * Math.pow(-1, i) * (Math.pow(x, 2 * i + 1) / fact);
        }

        System.out.println(s);
        System.out.print(Math.sin(x));
    }
}
