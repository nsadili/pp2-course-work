import java.util.*;
import java.lang.Math;
public class SumOfOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        for (int i = n + 1; i < m; i++) {
            if (i % 2 == 0) continue;
            sum += i;
        }
        System.out.print(sum);
    }
}