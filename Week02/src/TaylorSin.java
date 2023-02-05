import java.util.Scanner;

public class TaylorSin {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float x = scn.nextFloat();
        int n = scn.nextInt();
        int res = 0;
        for(int i=0; i<n; i++){
            res = res + (int) Math.pow(-1, i) * (int) Math.pow(x, 2*i+1) / factorial(2*i+1);
        }
        System.out.println(res);
        System.out.println(Math.sin(x));
    }
}
