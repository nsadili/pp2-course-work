import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float x = scn.nextFloat();
        int n = scn.nextInt();
        double sum = 0;
        for (int i  = 0; i < n ; i++){
            sum += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        System.out.println(sum);
    }
    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
