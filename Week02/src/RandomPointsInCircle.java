import java.util.Random;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        Random rand = new Random();
        float x = 2 * rand.nextFloat() - 1;
        float y = 2 * rand.nextFloat() - 1;
        while (x * x + y * y > 1) {
            x = 2 * rand.nextFloat() - 1;
            y = 2 * rand.nextFloat() - 1;
        }
        System.out.println("(" + x + ", " + y + ")");
    }
}