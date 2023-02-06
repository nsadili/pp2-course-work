import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i = a; i < b; i++) {
            int j = i, cnt = 0, n = 0;
            while (j > 0) {
                j /= 10; cnt++;
            }

            j = i;
            while (j > 0) {
                n += Math.pow(j % 10, cnt);
                j /= 10;
            }

            if (n == i) System.out.print(i + " ");
        }
    }
}
