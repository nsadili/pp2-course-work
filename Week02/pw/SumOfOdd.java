import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int m = Math.min(a, b);
            int n = Math.max(b, a);

            int sum = 0;
            for (int i = m; i <= n; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
        
    }
}
