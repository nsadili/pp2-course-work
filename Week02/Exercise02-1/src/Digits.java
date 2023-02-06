import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int x = n, a = n;
            int sum = 0, prd = 1, cnt = 1;

            while (x / 10 > 0) {
                a = x % 10; x /= 10;
                sum += a;
                cnt++;
            }
            sum += x;
            System.out.println(sum);

            x = n;
            while (x / 10 > 0) {
                a = x % 10; x /= 10;
                prd *= a;
            }
            prd *= x;
            System.out.println(prd);
            System.out.println(1.0 * sum / cnt);
    }
}
