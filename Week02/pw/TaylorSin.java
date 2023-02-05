import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Math.toRadians(sc.nextDouble());// Math.toRadians() method converst angle given in degrees into radians
        int n = sc.nextInt();
        double res = 0;
        for (int i = 0; i < n; i++) {
            int sign = (int) Math.pow(-1, i);
            int fact = 1;
            int j = 2 * i + 1;
            while (j > 1) {
                fact *= j;
                j--;
            }
            /*
            To calculate the factorial in the denominator
            */
            res += sign * (Math.pow(x, 2 * i + 1)) / fact;
        }
        System.out.println(res);
    }
}

