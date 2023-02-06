import java.util.Scanner;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            double x = Math.random();
            double y = Math.random();
            double distance = Math.sqrt(x * x + y * y);
            if (distance <= 1) {
                System.out.println("Point (" + x + ", " + y + ") is inside the circle");
            } else {
                System.out.println("Point (" + x + ", " + y + ") is outside the circle");
            }
        }
    }
}

