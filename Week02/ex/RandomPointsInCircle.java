import java.util.Scanner;

public class RandomPointsInCircle {
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter the number of points to generate: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        double x = Math.random() * 2 - 1;
        double y = Math.random() * 2 - 1;
        if (x * x + y * y <= 1) {
          System.out.println("Point " + (i + 1) + ": (" + x + ", " + y + ")");
        } else {
          i--;
        }
      }
}
}
}