import java.util.Scanner;

public class TaylorSin {
    static int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        double res = 0;
        for(int i = 0; i < n; i++)
        {
           res += Math.pow(-1, i) * (Math.pow(x, 2*i+1) / factorial(2*i+1));
        }
        System.out.println(res);
      
      scanner.close();
    }
