import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Math.toRadians(sc.nextDouble());
        double z = 0;
        for (int i = 0; i < n; i++) {
            int sign = (int) Math.pow(-1, i);
            int factorial = 1;
            int j = 2 * i + 1;
            while (j > 1) {
                fact *= j;
                j--;
            }
           
            z += sign * (Math.pow(x, 2 * i + 1)) / factorial;
        }
        System.out.println(z);
    }
}
