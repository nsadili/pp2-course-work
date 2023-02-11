import java.util.Random;

public class RollingDie {
    public static void main(String[] args) {
        Random random = new Random();
        double roll = random.nextDouble();
        int result;
        if (roll < 1.0 / 8.0 * 4.0) {
            result = random.nextInt(4) + 1;
        } else {
            result = random.nextInt(2) + 5;
        }
        System.out.println("Simulated roll: " + result);
    }
}
