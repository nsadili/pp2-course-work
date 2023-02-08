import java.util.Scanner;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x, y;
        for (; n > 0; n--) {
            x = Math.random();
            y = Math.random();
            System.out.printf("( %.3f, %.3f )\n", x, y);
        }
    }
}
