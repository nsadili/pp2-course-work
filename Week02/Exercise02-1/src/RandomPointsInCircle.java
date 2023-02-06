import java.util.Scanner;
import java.lang.Math;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            System.out.println("(" + x + ", " + y + ")");
        }
    }
}
