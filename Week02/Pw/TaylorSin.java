import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        int n = input.nextInt();
        int factorial = 1;
        int j = 1;
        int sum=0;
        double res = 0;
        while (j <= n) {
            factorial = j * 2 + 1;
            sum=sum+factorial;
            j++;
        }
        for (int i = 0; i <= n; i++) {
            res = res + (Math.pow(-1, i) * (Math.pow(x, 2 * i + 1) / factorial));
        }
        System.out.println(res);
    }

    private static int pow(double x, int i) {
        return 0;
    }
}
