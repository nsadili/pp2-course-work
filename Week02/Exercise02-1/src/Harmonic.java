import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            double s = 0;

            for (int i = 1; i <= n; i++) {
                s += (1.0 / i);
            }

            System.out.println(s);
    }
}
