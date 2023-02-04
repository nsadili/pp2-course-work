import java.util.Scanner;
import java.util.Random;

public class RollingDie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Rolling the loaded die...");
        double value = random.nextDouble();
        int result;
        if (value < 1.0 / 8.0 * 5) {
            result = 1 + (int) (random.nextDouble() * 4.0);
        } else {
            result = 5 + (int) (random.nextDouble() * 2.0);
        }

        System.out.println("The result is: " + result);
    }
}

